package com.gmoon.designpatterns.structural.facade.system;

import com.gmoon.designpatterns.structural.facade.amqp.AmqpService;
import com.gmoon.designpatterns.structural.facade.db.DatabaseService;
import com.gmoon.designpatterns.structural.facade.email.EmailSender;
import java.util.function.Consumer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SystemService {

  private final DatabaseService databaseService;
  private final AmqpService amqpService;
  private final EmailSender emailSender;

  public void checkHealth() {
    sendMailIfExceedHealthThreshold(this::checkHealthOfRabbitMQ, 15);
    sendMailIfExceedHealthThreshold(this::checkHealthOfDatabase, 85);
  }

  public void sendMailIfExceedHealthThreshold(Consumer<Integer> checker, int threshold) {
    try {
      checker.accept(threshold);
    } catch (Exception e) {
      emailSender.sendMessage(e.getMessage());
    }
  }

  private void checkHealthOfRabbitMQ(int threshold) {
    int current = amqpService.getQueueTotalsOfMessagesUnacknowledged();
    if (threshold < current) {
      throw new SystemException(String.format("[MQ] Unacknowledged message count over. threshold:%s, unackedMessageCount:%s", threshold, current));
    }
  }

  private void checkHealthOfDatabase(int threshold) {
    int usage = databaseService.getCurrentConnectionCount();
    if (threshold < usage) {
      throw new SystemException(String.format("[DB] Connection count over. threshold=%d, usage=%d", threshold, usage));
    }
  }
}

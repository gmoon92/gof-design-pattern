package com.gmoon.designpatterns.structural.facade;

import com.gmoon.designpatterns.structural.facade.amqp.AmqpService;
import com.gmoon.designpatterns.structural.facade.db.DatabaseService;
import com.gmoon.designpatterns.structural.facade.email.EmailSender;
import com.gmoon.designpatterns.structural.facade.system.SystemService;

public class Application {

  public static void main(String[] args) {
    DatabaseService databaseService = new DatabaseService();
    AmqpService amqpService = new AmqpService();
    EmailSender emailSender = new EmailSender();

    SystemService service = new SystemService(databaseService, amqpService, emailSender);

    service.checkHealth();
  }
}

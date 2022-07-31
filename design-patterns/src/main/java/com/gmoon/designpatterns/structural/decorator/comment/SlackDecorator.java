package com.gmoon.designpatterns.structural.decorator.comment;

public class SlackDecorator extends SmsNotificationWrapper {

  public SlackDecorator(NotificationService notificationService) {
    super(notificationService);
  }

  @Override
  public void notifyForUser(String comment) {
    System.out.println("Notification on Slack. comment: " + comment);
  }
}

package com.gmoon.designpatterns.structural.decorator.comment;

public class FacebookDecorator extends SmsNotificationWrapper {

  public FacebookDecorator(NotificationService notificationService) {
    super(notificationService);
  }

  @Override
  public void notifyForUser(String comment) {
    System.out.println("Notification on Facebook. comment: " + comment);
  }
}

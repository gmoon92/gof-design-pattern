package com.gmoon.designpatterns.structural.decorator.comment;

public abstract class SmsNotificationWrapper implements NotificationService {

  private NotificationService notificationService;

  public SmsNotificationWrapper(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  @Override
  public void addComment(String comment) {
    notificationService.addComment(comment);
    notifyForUser(comment);
  }

  public abstract void notifyForUser(String comment);
}

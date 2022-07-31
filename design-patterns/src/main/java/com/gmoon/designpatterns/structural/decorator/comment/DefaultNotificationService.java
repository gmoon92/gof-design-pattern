package com.gmoon.designpatterns.structural.decorator.comment;

public class DefaultNotificationService implements NotificationService {

  @Override
  public void addComment(String comment) {
    System.out.println("Notification on Application. comment: " + comment);
  }
}

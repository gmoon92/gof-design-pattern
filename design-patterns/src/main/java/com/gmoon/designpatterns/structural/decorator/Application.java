package com.gmoon.designpatterns.structural.decorator;

import com.gmoon.designpatterns.structural.decorator.comment.DefaultNotificationService;
import com.gmoon.designpatterns.structural.decorator.comment.FacebookDecorator;
import com.gmoon.designpatterns.structural.decorator.comment.NotificationService;
import com.gmoon.designpatterns.structural.decorator.comment.SlackDecorator;

public class Application {

  private boolean useNotificationOfSlack = true;
  private boolean useNotificationOfFacebook = true;

  public static void main(String[] args) {
    Application client = new Application();

    NotificationService notificationService = new DefaultNotificationService();
    if (client.useNotificationOfSlack) {
      notificationService = new SlackDecorator(notificationService);
    }

    if (client.useNotificationOfFacebook) {
      notificationService = new FacebookDecorator(notificationService);
    }

    String comment = "신규 댓글 등록";
    notificationService.addComment(comment);
  }
}

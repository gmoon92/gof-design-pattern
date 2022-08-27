package com.gmoon.designpatterns.behavioral.command;

import com.gmoon.designpatterns.behavioral.command.command.GameStartCommand;
import com.gmoon.designpatterns.behavioral.command.command.LightOnCommand;
import com.gmoon.designpatterns.behavioral.command.invoker.Button;
import com.gmoon.designpatterns.behavioral.command.receiver.Game;
import com.gmoon.designpatterns.behavioral.command.receiver.Light;

public class Application {

    public static void main(String[] args) {
        Button button = new Button();

        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}

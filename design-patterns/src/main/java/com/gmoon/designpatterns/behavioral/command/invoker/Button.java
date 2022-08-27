package com.gmoon.designpatterns.behavioral.command.invoker;

import java.util.Stack;

import com.gmoon.designpatterns.behavioral.command.command.Command;

public class Button {

    private final Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.empty()) {
            Command command = commands.pop();
            command.undo();
        }
    }
}

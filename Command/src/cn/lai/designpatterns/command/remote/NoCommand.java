package cn.lai.designpatterns.command.remote;


import cn.lai.designpatterns.command.Command;

/**
 * concreteCommand
 */
public class NoCommand implements Command {


    @Override
    public void execute() {
        System.out.println("set the command");
    }

    @Override
    public void undo() {

    }
}
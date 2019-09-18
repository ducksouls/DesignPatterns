package Command.src.cn.lai.designpatterns.command.remote;

import Command.src.cn.lai.designpatterns.command.Command;

/**
 * concreteCommand
 * 
 * 
 */
public class NoCommand implements Command{
     

    @Override
    public void execute() {
        System.out.println("set the command");
    }
}
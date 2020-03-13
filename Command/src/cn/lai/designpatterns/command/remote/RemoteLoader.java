package cn.lai.designpatterns.command.remote;


import cn.lai.designpatterns.command.Light;
import cn.lai.designpatterns.command.LightOffCommand;
import cn.lai.designpatterns.command.LightOnCommand;

/**
 * client
 */
public class RemoteLoader {
    public static void main(String[] args) {
        Light light = new Light(); // receiver

        LightOffCommand lightOffCommand = new LightOffCommand(light); //concreteCommand
        LightOnCommand lightOnCommand = new LightOnCommand(light); //concreteCommand

//        RemoteControl rc = new RemoteControl(); // invoker
        RemoteControlWithUndo rc = new RemoteControlWithUndo();
        rc.setCommand(0, lightOnCommand, lightOffCommand);
        rc.onAndOffButtonPressed(0);
        rc.onAndOffButtonPressed(0);
        rc.onAndOffButtonPressed(0);
        rc.onAndOffButtonPressed(0);
//        rc.onPressed(0);
        System.out.println("---------");
//        rc.offPressed(0);


//        rc.undoPressed();
//        rc.undoPressed();

        rc.onPressed(1);
        rc.offPressed(1);

    }
}
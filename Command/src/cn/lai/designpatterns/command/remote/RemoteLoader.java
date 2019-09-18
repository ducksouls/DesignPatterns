package Command.src.cn.lai.designpatterns.command.remote;

import Command.src.cn.lai.designpatterns.command.Light;
import Command.src.cn.lai.designpatterns.command.LightOffCommand;
import Command.src.cn.lai.designpatterns.command.LightOnCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        Light light = new Light();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        RemoteControl rc = new RemoteControl();
        rc.setCommand(0, lightOffCommand, lightOnCommand);

        rc.onPressed(0);
        rc.offPressed(0);
        
        rc.onPressed(1);
        rc.offPressed(1);
        
    }
}
package Command.src.cn.lai.designpatterns.command.remote;

import Command.src.cn.lai.designpatterns.command.Command;
/**
 * invoker
 */
public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    
    RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i<7 ;i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        
    }

    void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    void onPressed(int slot) {
        this.onCommand[slot].execute();
    }

    void offPressed(int slot) {
        this.offCommand[slot].execute();
    }
}
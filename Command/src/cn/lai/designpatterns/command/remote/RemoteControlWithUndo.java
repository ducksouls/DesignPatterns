package cn.lai.designpatterns.command.remote;

import cn.lai.designpatterns.command.Command;

/**
 * 撤销命令
 */
public class RemoteControlWithUndo {
    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;
    boolean isPressd = false;

    RemoteControlWithUndo() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    void onAndOffButtonPressed(int slot) {
        if(!isPressd) {
            this.onCommand[slot].execute();
            undoCommand = this.offCommand[slot];
            isPressd = !isPressd;
        } else {
            undoCommand.execute();
            isPressd = !isPressd;
        }
    }

    void onPressed(int slot) {
        this.onCommand[slot].execute();
        undoCommand = this.offCommand[slot];
    }

    void offPressed(int slot) {
        this.offCommand[slot].execute();
        undoCommand = this.onCommand[slot];
    }

    void undoPressed() {
        undoCommand.execute();
    }
}

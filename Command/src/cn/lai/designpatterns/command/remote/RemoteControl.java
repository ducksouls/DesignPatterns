package cn.lai.designpatterns.command.remote;

import cn.lai.designpatterns.command.Command;

/**
 * 请求调用者
 * invoker
 */
public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;
    boolean isPressd = false;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }

    }

    void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }
    /**
     * 开命令
     * @param slot 槽位序号
     */
    void onPressed(int slot) {
        /**
         * 有局限,on和off必须同一个
         */
        if (!isPressd) {
            this.onCommand[slot].execute();
            isPressd = true;
        } else {
            this.offCommand[slot].execute();
            isPressd = false;
        }

    }

    /**
     * 关命令
     * @param slot 槽位序号
     */
    void offPressed(int slot) {
        this.offCommand[slot].execute();
    }
}
package Command.src.cn.lai.designpatterns.command;

/**
 * invoker   
 * 命令的调用者，命令模式的精髓是通过command讲invoker和client解耦
 * 两者之间通过command通信
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
package cn.lai.designpatterns.command;


/**
 * command
 * 
 * 命令的接口，所有命令需要实现这个接口获得execute方法
 * 这个方法在不同实现下有不同的操作
 */
public interface Command {
    void execute();
    void undo();
}
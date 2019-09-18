package Command.src.cn.lai.designpatterns.command;

/**
 * concreteCommand 
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    GarageDoorOpenCommand(GarageDoor door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }



}

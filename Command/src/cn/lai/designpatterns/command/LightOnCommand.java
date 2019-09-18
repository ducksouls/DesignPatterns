package Command.src.cn.lai.designpatterns.command;

/**
 * concreteCommand 
 */
public class LightOnCommand implements Command {
    Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
    
}
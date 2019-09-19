package cn.lai.designpatterns.command;
public class Test {

    /**
     * 客户端
     * @param args
     */
    public static void  main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light li = new Light();
        LightOnCommand lightOn = new LightOnCommand(li);

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();

    }
}
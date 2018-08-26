package bridge2;

public class TVRemotePause extends RemoteControl {

    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV paused");
    }
}

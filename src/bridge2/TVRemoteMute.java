package bridge2;

public class TVRemoteMute extends RemoteControl {
    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was muted");
        getTheDevice().volumnLevel=0;
    }
}

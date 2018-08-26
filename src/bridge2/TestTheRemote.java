package bridge2;

public class TestTheRemote {
    public static void main(String[] args){
        RemoteControl theTV = new TVRemoteMute(new TVDevice(1,200));
        RemoteControl theTV2 = new TVRemotePause(new TVDevice(1,200));

        theTV.buttonSevenPressed();
        theTV.buttonSevenPressed();

        System.out.println(theTV.getTheDevice().volumnLevel);

        theTV.buttonNinePressed();

        System.out.println(theTV.getTheDevice().volumnLevel);
        theTV.deviceFeedback();
    }
}

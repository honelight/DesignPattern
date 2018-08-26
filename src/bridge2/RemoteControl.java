package bridge2;

public abstract class RemoteControl {
    private EntertainmentDevice theDevice;
    public RemoteControl(EntertainmentDevice newDevice){
        this.theDevice = newDevice;
    }

    public void buttonFivePressed(){
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed(){
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback(){
        theDevice.deviceFeedback();
    }

    public void buttonSevenPressed(){theDevice.buttonSevenPressed();}

    public void buttonEightPressed(){theDevice.buttonEightPressed();}

    public EntertainmentDevice getTheDevice(){
        return theDevice;
    }

    public abstract void buttonNinePressed();


}

package bridge2;

public abstract class EntertainmentDevice {
    public int deviceState;
    public int maxSetting;
    public int volumnLevel = 0;
    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();

    public void deviceFeedback(){
        if(deviceState > maxSetting || deviceState <0){
            deviceState = 0;
        }
        System.out.println("On "+deviceState);
    }

    public void buttonSevenPressed(){
        volumnLevel ++ ;
        System.out.println("Volumn at: "+volumnLevel);
    }

    public void buttonEightPressed(){
        volumnLevel--;
        System.out.println("Volumn at: "+volumnLevel);
    }
}

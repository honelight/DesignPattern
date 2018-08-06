package command;

public class Television implements ElectronicDevice {

    private int volumn = 0;

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void volumeUp() {
        volumn++;
        System.out.println("TV volumn is at "+volumn);
    }

    @Override
    public void volumeDown() {
        volumn--;
        System.out.println("TV volumn is at "+volumn);
    }
}

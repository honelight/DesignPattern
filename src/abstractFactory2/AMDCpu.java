package abstractFactory2;

public class AMDCpu implements CPU {
    private int cpuHoles;

    public AMDCpu(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU has "+cpuHoles+" hoes");
    }

    @Override
    public int getHolse() {
        return this.cpuHoles;
    }
}

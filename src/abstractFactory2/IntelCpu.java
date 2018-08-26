package abstractFactory2;

public class IntelCpu implements CPU {

    private int cpuHoles;

    public IntelCpu(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void calculate() {
        System.out.println("Intel Cpu has "+ cpuHoles +" holes");
    }

    @Override
    public int getHolse() {
        return this.cpuHoles;
    }
}

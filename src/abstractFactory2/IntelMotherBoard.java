package abstractFactory2;

public class IntelMotherBoard implements MotherBoard {
    private int cpuHoles;

    public IntelMotherBoard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu(CPU cpu) {
        System.out.println("Holes Matching "+(cpu.getHolse()==this.cpuHoles));
    }
}

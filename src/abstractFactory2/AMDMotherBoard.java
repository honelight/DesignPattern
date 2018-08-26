package abstractFactory2;

public class AMDMotherBoard implements MotherBoard {

    private int holse;

    public AMDMotherBoard(int holes){
        this.holse = holes;
    }

    @Override
    public void installCpu(CPU cpu) {
        System.out.println("CPU holes matches: "+(cpu.getHolse()==this.holse));
    }
}

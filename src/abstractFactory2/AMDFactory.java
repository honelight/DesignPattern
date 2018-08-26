package abstractFactory2;

public class AMDFactory implements AbstractFactory {
    @Override
    public CPU getCpu() {
        return new AMDCpu(938);
    }

    @Override
    public MotherBoard getMotherBoard() {
        return new AMDMotherBoard(938);
    }
}

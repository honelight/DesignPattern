package abstractFactory2;

public class IntelFactory implements AbstractFactory {
    @Override
    public CPU getCpu() {
        return new IntelCpu(755);
    }

    @Override
    public MotherBoard getMotherBoard() {
        return new IntelMotherBoard(755);
    }
}

package abstractFactory2;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        AbstractFactory intelFactory = new IntelFactory();
        AbstractFactory amdFactory = new AMDFactory();

        CPU intelCPU = intelFactory.getCpu();
        CPU amdCPU = amdFactory.getCpu();

        MotherBoard intelMotherBoard = intelFactory.getMotherBoard();
        MotherBoard amdMotherBoard = amdFactory.getMotherBoard();

        intelCPU.calculate();
        amdCPU.calculate();

        intelMotherBoard.installCpu(intelCPU);
        intelMotherBoard.installCpu(amdCPU);

        amdMotherBoard.installCpu(intelCPU);
        amdMotherBoard.installCpu(amdCPU);
    }
}

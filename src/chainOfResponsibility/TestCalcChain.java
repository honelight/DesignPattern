package chainOfResponsibility;

public class TestCalcChain {
    public static void main(String[] args){
        Chain chainCalc1 = new AddNumber();
        Chain chainCalc2 = new Substract();
        Chain chainCalc3 = new Multiply();
        Chain chainCalc4 = new Divide();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4,2,"substract");
        try {
            chainCalc1.calculate(request);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

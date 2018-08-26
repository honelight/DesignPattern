package chainOfResponsibility;

public class Divide implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) throws Exception {
        if(request.getCalculationWanted() == "div"){
            System.out.println(request.getNumber1()+"/"+request.getNumber2() +
                    "=" +(request.getNumber1()/request.getNumber2()));
        }
        else{
            throw new Exception("Invalid operation");
        }
    }
}

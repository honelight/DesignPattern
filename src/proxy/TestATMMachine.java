package proxy;

public class TestATMMachine {
    public static void main(String[] args){
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);

        GetATMData realATMMachine = new ATMMachine();

        GetATMData realATMProxy = new ATMProxy();

        System.out.println("Current ATM State: "+realATMProxy.getATMData());
        System.out.println("Cash in ATM: "+realATMProxy.getCashInMachine());
    }
}

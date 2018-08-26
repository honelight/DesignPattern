package state;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine newMachine){
        this.atmMachine = newMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("No card inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card inserted");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Pin already entered");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("Get " + cashToWithdraw + " amount");
            atmMachine.requestCash(cashToWithdraw);
        }
        else{
            System.out.println("Not enough cash");
        }
    }
}

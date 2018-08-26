package state;

public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine){
        this.atmMachine = newATMMachine;
    }


    @Override
    public void insertCard() {
        System.out.println("You can't insert more then one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejectd");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if(pinEntered == 1234){
            System.out.println("Correct Pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
        else{
            System.out.println("Incorrect Pin");
            atmMachine.correctPinEntered = false;
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter pin first");
    }
}

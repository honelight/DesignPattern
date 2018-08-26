package state;

public class NoCard implements ATMState{
    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine){
        this.atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card Inserted");
        System.out.println("Please Enter a PIN");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("You can't eject card when there is no card");

    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter a card first");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter a card first");
    }
}

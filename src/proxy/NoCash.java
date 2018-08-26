package proxy;

public class NoCash implements ATMState {
    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("No cash");
    }

    @Override
    public void ejectCard() {
        System.out.println("No cash");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("No cash");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("No cash");
    }
}

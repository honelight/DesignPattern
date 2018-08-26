package proxy;

public class ATMProxy implements GetATMData{

    private ATMMachine realATMMachine;

    @Override
    public ATMState getATMData() {
        if(realATMMachine==null) {
            realATMMachine = new ATMMachine();
        }
        return realATMMachine.getATMData();
    }

    @Override
    public int getCashInMachine() {
        if(realATMMachine==null) {
            realATMMachine = new ATMMachine();
        }
        return realATMMachine.getCashInMachine();
    }
}

package facade;

public class FundsCheck {
    private double cashInAcount = 1000.00;

    public double getCachInAccount(){return cashInAcount;}
    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAcount-= cashWithdrawn;
    }
    public void increaseCashInAccount(double cashDeposited){
        cashInAcount+=cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal){
        if(cashToWithdrawal > getCachInAccount()){
            System.out.println("Error: you don't have enough money");
            System.out.println("Current Balance: "+getCachInAccount());
            return false;
        }else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal Complete: Current Balance is: " + getCachInAccount());
            return true;
        }
    }

    public void makeDeposite(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposite Complete: Current Balance is: "+getCachInAccount());
    }
}

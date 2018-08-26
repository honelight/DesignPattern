package facade;

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;
    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundsCheck;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode){
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber(){return accountNumber;}
    public int getSecurityCode(){return securityCode;}
    public void withdrawCash(double cashToGet){
        if(acctChecker.accountActive(getAccountNumber())&&
            codeChecker.isCodeCorrect(getSecurityCode())&&
                fundsCheck.haveEnoughMoney(cashToGet)
        ){
            System.out.println("Transaction Complete \n");
        }
        else{
            System.out.println("Transaction Failed \n");
        }
    }

    public void depositeCash(double cashToDeposite){
        if(acctChecker.accountActive(getAccountNumber())&&
                codeChecker.isCodeCorrect(getSecurityCode())
        ){
            fundsCheck.increaseCashInAccount(cashToDeposite);
            System.out.println("Transaction Complete");
        }else{
            System.out.println("Transaction Failed \n");
        }
    }

}

package facade;

/**
 * Created by Abilash on 7/13/2014.
 */
public class BankFacade {
    private int accountNum;
    private int securityCode;

    private AccountNumCheck accountNumChecker;
    private SecurityCodeCheck securityCodeChecker;
    private FundsCheck fundsChecker;


    public BankFacade(int accountNum, int securityCode) {
        this.accountNum = accountNum;
        this.securityCode = securityCode;
        this.securityCodeChecker = new SecurityCodeCheck();
        this.accountNumChecker = new AccountNumCheck();
        this.fundsChecker = new FundsCheck();
    }

    public void withDraw(int amount) {
        System.out.println("Transaction Processing");
        if(accountNumChecker.isAccountActive(accountNum) && securityCodeChecker.isSecurityCodeCorrect(accountNum, securityCode)
                && fundsChecker.haveEnoughFunds(amount)){
            fundsChecker.withdrawAmount(amount);
        }
    }

    public void deposit(int amount) {
        System.out.println("Transaction Processing");
        if(accountNumChecker.isAccountActive(accountNum) &&
                securityCodeChecker.isSecurityCodeCorrect(accountNum, securityCode)){
            fundsChecker.makeDeposit(amount);
        }
    }
}

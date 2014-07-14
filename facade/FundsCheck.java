package facade;

/**
 * Created by Abilash on 7/13/2014.
 */
public class FundsCheck {
    private int cashInAccount = 500;

    public int getCashInAccount(){
        return cashInAccount;
    }

    public boolean haveEnoughFunds(int withdrawAmt){
        if(!(withdrawAmt <= getCashInAccount())){
            System.out.println("Transaction Failed: Insufficient Funds: Available Balance: " + getCashInAccount());
            return false;
        }

        return true;
    }

    public void makeDeposit(int depositAmt){
        cashInAccount += depositAmt;
        System.out.println("Deposit Complete: Current Balance: " + getCashInAccount());
    }

    public void withdrawAmount(int withdrawalAmt){
        cashInAccount -= withdrawalAmt;
        System.out.println("Withdrawal Complete: Remaining Balance: " + getCashInAccount());
    }
}

package facade;

/**
 * Created by Abilash on 7/13/2014.
 */
public class FacadeTest {

    public static void main(String[] args) {
        BankFacade myBank = new BankFacade(654321, 1234);
        System.out.println("Withdraw amount 50");
        myBank.withDraw(50);
        System.out.println("Withdraw amount 2000");
        myBank.withDraw(2000);
        System.out.println("Deposit amount 100");
        myBank.deposit(100);
    }
}

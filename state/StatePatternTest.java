package state;

/**
 * Created by Abilash on 8/2/2014.
 */
public class StatePatternTest {

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.withdrawCash(1000);

        atmMachine.insertCard();
        atmMachine.withdrawCash(1000);
        atmMachine.enterPin(1234);
        atmMachine.withdrawCash(1000);

        atmMachine.insertCard();
        atmMachine.enterPin(1234);
    }
}

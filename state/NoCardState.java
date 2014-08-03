package state;

/**
 * Created by Abilash on 8/2/2014.
 */
public class NoCardState implements ATMState {
    ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card Inserted. Enter pin.");
        atmMachine.setCurrentState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter the card first");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Enter the card first");
    }

    @Override
    public void withdrawCash(int drawCash) {
        System.out.println("Enter the card first");
    }
}

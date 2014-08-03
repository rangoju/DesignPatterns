package state;

/**
 * Created by Abilash on 8/2/2014.
 */
public class NoCashState implements ATMState {
    ATMMachine atmMachine;

    public NoCashState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM temporarily out of service");
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM temporarily out of service and no card is inserted");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("ATM temporarily out of service");
    }

    @Override
    public void withdrawCash(int drawCash) {
        System.out.println("ATM temporarily out of service");
    }
}

package state;

/**
 * Created by Abilash on 8/2/2014.
 */
public class HasCardState implements ATMState {
    ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Cannot insert two cards at a time");
    }

    @Override
    public void ejectCard() {
        System.out.println("Please take the card");
        atmMachine.setCurrentState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        if(atmMachine.isPinCorrect(pin)){
            System.out.println("Pin Correct");
            atmMachine.setEnteredCorrectPin(true);
            atmMachine.setCurrentState(atmMachine.getHasPinState());
        }else{
            System.out.println("Pin Incorrect. Try again.");
            atmMachine.setEnteredCorrectPin(false);
        }


    }

    @Override
    public void withdrawCash(int drawCash) {
        System.out.println("Enter the pin first");
    }
}

package state;

/**
 * Created by Abilash on 8/2/2014.
 */
public class ATMMachine {
    ATMState noCardState;
    ATMState hasCardState;
    ATMState hasPinState;
    ATMState noCashState;

    ATMState currentState;

    private int cashInMachine = 2000;
    private boolean enteredCorrectPin = false;

    public ATMMachine(){
        System.out.println("Welcome to ABC bank");
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        hasPinState = new HasPinState(this);
        noCashState = new NoCashState(this);

        currentState = noCardState;
    }

    public void insertCard(){
        currentState.insertCard();
    }

    public void ejectCard(){
        currentState.ejectCard();
    }

    public void enterPin(int pin){
        currentState.enterPin(pin);
    }

    public void withdrawCash(int drawCash){
        currentState.withdrawCash(drawCash);
    }

    public boolean isPinCorrect(int pinEntered){
        if(pinEntered == 1234){
            return true;
        }else{
            return false;
        }
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getHasPinState() {
        return hasPinState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void setCurrentState(ATMState newState) {
        this.currentState = newState;
    }

    public void setEnteredCorrectPin(boolean enteredCorrectPin) {
        this.enteredCorrectPin = enteredCorrectPin;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }
}

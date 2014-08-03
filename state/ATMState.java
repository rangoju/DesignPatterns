package state;

/**
 * Created by Abilash on 8/2/2014.
 */
public interface ATMState {
    public void insertCard();
    public void ejectCard();
    public void enterPin(int pin);
    public void withdrawCash(int drawCash);
}

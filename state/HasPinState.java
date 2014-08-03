package state;

/**
 * Created by Abilash on 8/2/2014.
 */
public class HasPinState implements ATMState {
    ATMMachine atmMachine;

    public HasPinState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected.");
        atmMachine.setCurrentState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Pin already entered");
    }

    @Override
    public void withdrawCash(int drawCash) {
        System.out.println("Transaction Processing");
        if(drawCash > atmMachine.getCashInMachine()){
            System.out.println("ATM doesn't have that much cash");
        }else{
            System.out.println("Please collect your cash " + drawCash);
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - drawCash);

        }
        System.out.println("Card Ejected");
        atmMachine.setCurrentState(atmMachine.getNoCardState());
        if(atmMachine.getCashInMachine() <= 0){
            atmMachine.setCurrentState(atmMachine.getNoCashState());
        }
    }
}

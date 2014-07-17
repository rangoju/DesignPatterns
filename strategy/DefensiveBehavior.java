package strategy;

/**
 * Created by Abilash on 7/15/2014.
 */
public class DefensiveBehavior implements IBehavior {
    @Override
    public void move() {
        System.out.println("I am a defensive player and I move with strategies");
    }

    @Override
    public String toStr() {
        return "Defensive";
    }
}

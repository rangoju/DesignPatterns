package strategy;

/**
 * Created by Abilash on 7/15/2014.
 */
public class AggressiveBehavior implements IBehavior {
    @Override
    public void move() {
        System.out.println("I am aggressive and I move very fast");
    }

    @Override
    public String toStr() {
        return "Aggressive";
    }
}

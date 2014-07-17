package strategy;

/**
 * Created by Abilash on 7/15/2014.
 */
public class FifaPlayer {
    String name;
    IBehavior moveBehavior;

    public FifaPlayer(String name, IBehavior behavior){
        this.name = name;
        this.moveBehavior = behavior;
        System.out.println("Hi, I am " + name);
    }

    public void setMoveBehavior(IBehavior behavior){
        this.moveBehavior = behavior;
        System.out.println("Changing "+ name+ "'s behavior to " + behavior.toStr());
    }

    public void move(){
        moveBehavior.move();
    }
}

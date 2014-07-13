package adapter;

/**
 * Created by Abilash on 7/12/2014.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");

    }
}

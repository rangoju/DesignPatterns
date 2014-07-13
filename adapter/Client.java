package adapter;

/**
 * Created by Abilash on 7/12/2014.
 */
public class Client {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();
        Turkey turkey = new Turkey();
        Duck duckLikeTurkey = new Adapter(turkey);
        duckLikeTurkey.quack();
        duckLikeTurkey.fly();
    }
}

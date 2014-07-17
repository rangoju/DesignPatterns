package singleton;

/**
 * Created by Abilash on 7/16/2014.
 */
public class Singleton1 {
    private static Singleton1 reference = new Singleton1();

    private Singleton1(){
        System.out.println("Singleton1 initialized");
    }

    public static Singleton1 getInstance(){
        return reference;
    }

    public void doSomething(){
        System.out.println("Singleton1 doing something");
    }
}

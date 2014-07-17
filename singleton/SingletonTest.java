package singleton;

/**
 * Created by Abilash on 7/16/2014.
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton1 singleton1;
        System.out.println("Getting singleton1 reference");
        singleton1 = Singleton1.getInstance();
        singleton1.doSomething();
        Singleton1 singleton11 = Singleton1.getInstance();
        singleton11.doSomething();

        Singleton2 singleton2;
        System.out.println("Getting singleton2 reference");
        singleton2 = Singleton2.getInstance();
        singleton1.doSomething();
        Singleton2 singleton22 = Singleton2.getInstance();
        singleton22.doSomething();

    }
}

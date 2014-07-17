package singleton;

/**
 * Created by Abilash on 7/16/2014.
 */
public class Singleton2 {
    private static volatile Singleton2 instance = null;

    private Singleton2(){
        System.out.println("Singleton2 initialized");
    }

    public static Singleton2 getInstance(){
        if(instance == null){
            synchronized (Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Singleton2 doing something");
    }
}

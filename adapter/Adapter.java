package adapter;

/**
 * Created by Abilash on 7/12/2014.
 */
public class Adapter implements Duck {

    Turkey turkey;

    public Adapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i < 5; i++){
            turkey.fly();
        }

    }
}

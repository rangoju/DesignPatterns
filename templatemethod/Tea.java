package templatemethod;

/**
 * Created by Abilash on 7/30/2014.
 */
public class Tea extends CaffeineBeverage {

    protected String name() {
        return "tea";
    }

    public Tea(){
        System.out.println("======= TEA =======");
    }

    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    protected void brewBeverage() {
        System.out.println("Steeping the tea");
    }
}

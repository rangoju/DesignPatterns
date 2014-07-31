package templatemethod;

/**
 * Created by Abilash on 7/28/2014.
 */
public abstract class CaffeineBeverage {

    final public void prepare(){
        boilWater();
        brewBeverage();
        pourInCup();
        if(needCondiments())
            addCondiments();
    }

    protected boolean needCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    protected abstract void brewBeverage();

    private void pourInCup() {
        System.out.println("Pouring the " + name() + " in cup");
    }

    protected abstract String name();

    private void boilWater() {
        System.out.println("Boiling Water");
    }


}

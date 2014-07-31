package templatemethod;

/**
 * Created by Abilash on 7/30/2014.
 */
public class Coffee extends CaffeineBeverage {
    private boolean needCondiments;

    public Coffee(boolean needCondiments){
        this.needCondiments = needCondiments;
        if(this.needCondiments)
            System.out.println("======= Coffee =======");
        else
            System.out.println("======= Coffee without condiments =======");
    }

    public Coffee(){
        System.out.println("======= Coffee without condiments =======");
    }

    protected String name() {
        return "coffee";
    }

    protected void addCondiments() {
        System.out.println("Adding Sugar and Cream");
    }

    protected void brewBeverage() {
        System.out.println("Brewing the Coffee");
    }

    protected boolean needCondiments(){
        return needCondiments;
    }
}

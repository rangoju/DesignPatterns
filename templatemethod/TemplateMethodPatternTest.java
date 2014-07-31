package templatemethod;

/**
 * Created by Abilash on 7/30/2014.
 */
public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepare();
        Coffee myCoffee = new Coffee(true);
        myCoffee.prepare();
        Coffee coffeeWithoutCond = new Coffee(false);
        coffeeWithoutCond.prepare();
    }
}

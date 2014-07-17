package strategy;

/**
 * Created by Abilash on 7/15/2014.
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        FifaPlayer player = new FifaPlayer("Messi", new AggressiveBehavior());
        player.move();
        System.out.println();
        FifaPlayer defPlayer = new FifaPlayer("Pepe", new DefensiveBehavior());
        defPlayer.move();
        defPlayer.setMoveBehavior(new AggressiveBehavior());
        defPlayer.move();

    }
}

package coinToss;

import java.util.Random;

public class coinToss {

    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        coinToss game = new coinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
}

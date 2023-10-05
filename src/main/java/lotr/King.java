package lotr;
import java.util.Random;

import kick.RandomKick;


public class King extends Character {
    public King() {
        super(new Random().nextInt(5, 15), new Random().nextInt(5, 15), new RandomKick());
    }
}

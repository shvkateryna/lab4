package lotr;

import java.util.Random;

import kick.RandomKick;

public class Knight extends Character{
    public Knight() {
        super(new Random().nextInt(2, 12), new Random().nextInt(2, 12), new RandomKick());
    }
}

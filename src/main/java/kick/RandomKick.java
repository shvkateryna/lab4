package kick;
import java.util.Random;
import lotr.Character;
public class RandomKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        Random random = new Random();
        int random_minus = 0;
        int minus = whoIsKicked.getHp();
    
        if (whoIsKicked.getPower() != 0) {
            random_minus = random.nextInt(whoIsKicked.getPower());
            minus = whoIsKicked.getHp() - random_minus;
            whoIsKicked.setHp(minus);
        } else {
            whoIsKicked.setHp(0);
        }

        if (whoIsKicked.getHp() == 0) {
            System.out.println(whoIsKicked.getClass().getSimpleName() + " is dead");
        } else {
            System.out.println(whoIsKicked.getClass().getSimpleName() + " lost " + random_minus + " points of his hp");
        }
    }
}
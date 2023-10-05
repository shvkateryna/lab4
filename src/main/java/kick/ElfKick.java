package kick;
import lotr.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoKick.getPower() > whoIsKicked.getPower()) {
            whoIsKicked.setHp(0);
            System.out.println(whoIsKicked.getClass().getSimpleName() + " is dead");
        } else {
            whoKick.setPower(whoKick.getPower() - 1);
            System.out.println(whoKick.getClass().getSimpleName() + " lost 1 point of his power");
        }
        
    }
}

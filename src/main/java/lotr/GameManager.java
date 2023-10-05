package lotr;

public class GameManager {
    public static void fight(Character player1, Character player2) {
        int counter = 1;
        boolean whoKicks = true;
        if (player1.getClass() == player2.getClass()) {

            System.out.println("Characters with the same type can't kick each other");

        } else {

            while (player1.isAlive() && player2.isAlive()) {
                System.out.println("Round " + counter);
                if (whoKicks == true) {
                    System.out.println(player1.getClass().getSimpleName() + " kicks " + player2.getClass().getSimpleName());
                    player1.kick(player2);
                    whoKicks = false;
                } else {
                    System.out.println(player2.getClass().getSimpleName() + " kicks " + player1.getClass().getSimpleName());
                    player2.kick(player1);
                    whoKicks = true;
                }
                counter += 1;
            }
            if (player1.isAlive()) {
                System.out.println(player1.getClass().getSimpleName() + " won the game!");
            } else {
                System.out.println(player2.getClass().getSimpleName() + " won the game!");
            }
        }

    }

    public static void main(String[] args) {
        King king = new King();
        Knight knight = new Knight();
        Hobbit hobbit1 = new Hobbit();
        Hobbit hobbit2 = new Hobbit();
        Elf elf = new Elf();
        fight(elf, knight);
    }
}

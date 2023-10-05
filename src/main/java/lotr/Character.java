package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public void setPower(int hp) {
        this.power = power > 0 ? power : 0;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + this.hp + ", power=" + this.power + "}";
    }
}

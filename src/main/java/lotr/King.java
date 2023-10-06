package lotr;
import java.util.Random;

import kick.kingkick;

public class King extends Character {
    public King(){
        super(0, 0, new kingkick());
        Random random = new Random();
        int min = 5; 
        int max = 15; 
        this.power = random.nextInt(max - min) + min;
        this.hp = random.nextInt(max - min) + min;
    }
}

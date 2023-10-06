package lotr;

import java.util.Random;

import kick.kingkick;

public class Knight extends Character {
    public Knight(){
        super(0, 0, new kingkick());
        Random random = new Random();
        int min = 2;
        int max = 12;
        this.power = random.nextInt(max - min) + min;
        this.hp = random.nextInt(max - min) + min;
    }
}
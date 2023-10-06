package kick;
import lotr.Character;
import java.util.Random;

public class kingkick implements basickick{
    public void kick(Character c, Character a){
        Random random = new Random();
        int min = 0; 
        int max = c.power; 
        int damage = random.nextInt(max - min) + min;
        a.setHp(a.getHp() - damage);
}
}

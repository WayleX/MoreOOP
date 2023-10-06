package kick;
import lotr.Character;

public class elfkick implements basickick{
    public void kick(Character c, Character a){
        if (c.power >  a.power){
            a.setHp(0);
        }
        else{
            a.power -= 1;
        }
    }
}
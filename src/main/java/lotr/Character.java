package lotr;
import kick.basickick;
public class Character {
    public int power;
    public int hp;
    public basickick basickick;
    public Character(int power, int hp,  basickick kick){
        this.power = power;
        this.hp = hp;
        this.basickick = kick;
    }
    public void kick(Character c){
        basickick.kick(this, c);
    }
    public boolean isAlive(){
        return hp <= 0 ? false : true;
    };
    public void setHp(int hp){
        this.hp = hp > 0 ? hp : 0;
    }
    public int getHp(){
        return this.hp;
    }
    public int getPower(){
        return this.power;
    }
    @Override
    public String toString(){
        String s;
        s = "";
        s += this.getClass().getSimpleName();
        s += "{hp=";
        s += this.hp;
        s += ", power=";
        s += this.power;
        s += "}>";
        return s;
    }
}

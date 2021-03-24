package codingfactory.rpgconsole.enemy;

import codingfactory.rpgconsole.hero.Hero;
import java.util.Random;

public class Enemy {

    private String name;
    private int level;
    private int hp;
    private int atk;

    public Enemy(String name, int level){ //construct
        this.name = name;
        this.level = level;
        this.hp = 15*level;
        this.atk = 1*level;
    }

    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }

    public void attack(Hero hero) {
        Random rand = new Random();
        int randomNum = rand.nextInt(this.level + 1);
        hero.takeDamage(this.atk+randomNum); //hero take damage for enemy attack
    }
}

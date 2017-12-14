package codingfactory.rpgconsole.enemy;

import codingfactory.rpgconsole.hero.Hero;
import java.util.Random;

public class Enemy {

    private String name;
    private Integer level;
    private Integer hp;
    private Integer atk;

    public Enemy(String name, Integer level){ //construct
        this.name = name;
        this.level = level;
        this.hp = 15*level;
        this.atk = 1*level;
    }

    public String getName(){
        return this.name;
    }

    public Integer getHp(){
        return this.hp;
    }

    public void takeDamage(Integer damage){
        this.hp -= damage;
    }

    public void attack(Hero hero) {
        Random rand = new Random();
        int randomNum = rand.nextInt(this.level + 1);
        hero.takeDamage(this.atk+randomNum); //hero take damage for enemy attack
    }
}

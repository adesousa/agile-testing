package codingfactory.rpgconsole.hero;

import codingfactory.rpgconsole.enemy.Enemy;
import java.util.Random;

public class Hero {

    private String name;
    private Integer level;
    private Integer hp;
    private Integer atk;

    public Hero(String name){ //construct
        this.name = name;
        this.level = 1;
        this.hp = 20;
        this.atk = 2;
    }

    public String getName() {
       return this.name;
    }

    public Integer getHp(){
        return this.hp;
    }

    public Integer getLevel(){
        return this.level;
    }

    public Integer getAtk(){
        return this.atk;
    }

    private void setLevel(Integer newLevel) {
        this.level = newLevel;
    }

    public void takeDamage(Integer damage){
        this.hp -= damage;
    }

    public void attack(Enemy enemy) {
        Random rand = new Random();
        int randomNum = rand.nextInt(this.level + 1);
        enemy.takeDamage(this.atk+randomNum); //enemy take damage for hero attack
    }

    public void levelUp() {
        this.setLevel(this.level+1);
    }

}

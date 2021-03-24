package codingfactory.rpgconsole.hero;

import codingfactory.rpgconsole.enemy.Enemy;
import java.util.Random;

public class Hero {

    private String name;
    private int level;
    private int hp;
    private int atk;

    public Hero(String name){ //construct
        this.name = name;
        this.level = 1;
        this.hp = 20;
        this.atk = 2;
    }

    public String getName() {
       return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    public int getLevel(){
        return this.level;
    }

    public int getAtk(){
        return this.atk;
    }

    private void setLevel(int newLevel) {
        this.level = newLevel;
    }

    public void takeDamage(int damage){
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

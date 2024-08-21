package heroes;

import Enemies.Enemy;

public class Warrior extends Hero{
    public Warrior(String name, int health){
        super(name, health);
    }

    public void takeDamage(int damage){
        int hp = getHealth() - damage;
        setHealth(hp);

        if (getHealth() > 0) {
            System.out.println("Оставшееся HP героя: " + getHealth());
        }
        else {
            System.out.println("Герой погиб");
        }

        System.out.println("-----------------");;
    }
    @Override
    public void attackEnemy(Enemy enemy){
        if(getHealth() > 0) {
            System.out.println("Воин " + getName() + " атакует");
            enemy.takeDamage(60);
        }
    }
}

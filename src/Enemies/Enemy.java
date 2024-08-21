package Enemies;
import heroes.Hero;
import Interfaces.Mortal;
public class Enemy implements Mortal{
    private int health;


    public Enemy(int health ){
        this.health = health;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        System.out.println("Нанесенный урон: " + damage);

        this.health -= damage;
        if (this.health > 0) {
            System.out.println("Оставшееся HP врага: " + this.health);

        }
        else{
            System.out.println("Враг повержен!");
        }
        System.out.println("-----------------");
    }

    @Override
    public boolean isAlive(){
        return health > 0;
    }



}

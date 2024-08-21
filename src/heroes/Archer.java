package heroes;
import Enemies.Enemy;

public class Archer extends Hero {
    public Archer(String name, int health){
        super(name, health);
    }
    public void takeDamage(int damage){

        int hp = getHealth() - damage * 3;
        setHealth(hp);

        if (getHealth() > 0) {
            System.out.println("Оставшееся HP героя: " + getHealth());
        } else {
            System.out.println("Герой погиб");
        }

        System.out.println("-----------------");
    }

    @Override
    public void attackEnemy(Enemy enemy){
        if(getHealth() > 0) {
            System.out.println("Лучник " + getName() + " атакует");
            enemy.takeDamage(30);
        }
   }
}

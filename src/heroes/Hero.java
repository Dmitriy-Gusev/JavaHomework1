package heroes;
import Enemies.Enemy;

public abstract class Hero {
    private String name;
    private int health;

    public Hero(String name, int health){
        this.name = name;
        this.health = health;
    }

    public  String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

}
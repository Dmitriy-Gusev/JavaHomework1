package Ground;

import Enemies.Enemy;
import heroes.Archer;
import heroes.Hero;
import heroes.Mage;
import heroes.Warrior;


import java.util.Scanner;
public class TrainingGround {
    public static void trainingGround(){
        Enemy enemy = new Enemy(200);
        Warrior warrior = new Warrior("Stive", 50);
        Mage mage = new Mage("Dumbledore",40);
        Archer archer = new Archer("Victor",60);

        Scanner scan = new Scanner(System.in);

        while (enemy.getHealth() > 0) {

            System.out.println("1 - Воин");
            System.out.println("2 - Маг");
            System.out.println("3 - Лучник");

            System.out.print("Выберете персонажа: ");
            int ChoosingHero = scan.nextInt();

            System.out.println("-----------------");

            switch (ChoosingHero){
                case 1:
                    warrior.attackEnemy(enemy);
                    warrior.takeDamage(20);
                    break;
                case 2:
                    mage.attackEnemy(enemy);
                    mage.takeDamage(20);
                    break;
                case 3:
                    archer.attackEnemy(enemy);
                    archer.takeDamage(20);
                    break;
                default:
                    System.out.println("Введено некоректное значение");
            }

        }

    }
}

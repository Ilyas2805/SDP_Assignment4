package FactoryPattern;

import java.util.Scanner;

public class MyApplication {

    public static void main(String[] args){
        EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy = null;


		EnemyShip ufoShip = new UFOEnemyShip();

		doStuffEnemy(ufoShip);

		System.out.print("\n");

		Scanner userInput = new Scanner(System.in);

		String enemyShipOption = "";

		System.out.print("What type of ship? (U or R)");

		if (userInput.hasNextLine()){

			enemyShipOption = userInput.nextLine();

		}

		if (enemyShipOption == "U"){

			theEnemy = new UFOEnemyShip();


		} else

		if (enemyShipOption == "R"){

			theEnemy = new RocketEnemyShip();

		} else {

			theEnemy = new BigUFOEnemyShip();

		}

		doStuffEnemy(theEnemy);

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.displayEnemyShip();

        anEnemyShip.followHeroShip();

        anEnemyShip.enemyShipShoots();

    }

}
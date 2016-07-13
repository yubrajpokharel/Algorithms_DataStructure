package com.Patterns.Factory;

import java.util.Scanner;

/**
 * Created by yubraj on 7/12/16.
 */
public class App {

    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EmenyShip emenyShip = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ship type [ U / R ] :: ");
        if(input.hasNextLine()){
            String result = input.nextLine();
            emenyShip = enemyShipFactory.getEnemyShip(result);
        }

        if (emenyShip != null)
            doStuffs(emenyShip);
        else
            ifShipNull();

    }

    private static void doStuffs(EmenyShip emenyShip) {
        emenyShip.showInDisplay();
        emenyShip.followHeroShip();
        emenyShip.enemyShipShoot();
    }

    public static void ifShipNull(){
        System.out.println("please try again");
    }


}

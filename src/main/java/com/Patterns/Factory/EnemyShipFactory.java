package com.Patterns.Factory;

/**
 * Created by yubraj on 7/12/16.
 */
public class EnemyShipFactory {

    public EmenyShip getEnemyShip(String name){
        EmenyShip emenyShip = null;

        if(name.equalsIgnoreCase("u"))
            emenyShip = new UFOShip();
        else if(name.equalsIgnoreCase("r"))
            emenyShip = new RocketShip();
        else
            return null;

        return emenyShip;
    }

}

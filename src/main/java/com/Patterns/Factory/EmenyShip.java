package com.Patterns.Factory;

/**
 * Created by yubraj on 7/12/16.
 */
public abstract class EmenyShip {
    String name;
    double destroy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDestroy() {
        return destroy;
    }

    public void setDestroy(double destroy) {
        this.destroy = destroy;
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }

    public void showInDisplay(){
        System.out.println(getName() + " is displaying on the screen");
    }

    public void enemyShipShoot(){
        System.out.println(getName() + " attacks hero and have damage of "+ getDestroy());
    }

}

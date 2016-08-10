package com.OOAD.clone.Animal;

/**
 * Created by yubraj on 8/1/16.
 */
public class Animal implements Cloneable{

    private String name;
    private int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String talk(){
        return "I am animal and I talk wow :)";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

}

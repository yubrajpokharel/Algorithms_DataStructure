package com.OOAD.clone.Animal;

import java.lang.annotation.Documented;

/**
 * Created by yubraj on 8/1/16.
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy", 4);
        try {
            Dog cloneDog = (Dog) dog.clone();
            System.out.println(cloneDog.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

package com.OOAD.clone.Animal;

import java.lang.annotation.Documented;

/**
 * Created by yubraj on 8/1/16.
 */
public class Dog extends Animal {

    public Dog(String name, int legs) {
        super(name, legs);
    }

    public String talk(){
        return "Bow Bow";
    }


}

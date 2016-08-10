package com.OOAD.clone;

/**
 * Created by yubraj on 8/1/16.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("yubraj", "25");
        try {
            Person clone = (Person) person.clone();
            System.out.println(clone.getName());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            System.err.println("Clone Not supported");
        }
    }
}

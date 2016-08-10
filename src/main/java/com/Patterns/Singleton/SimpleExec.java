package com.Patterns.Singleton;

/**
 * Created by yubraj on 7/12/16.
 */
public class SimpleExec {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println("First Instance");
        System.out.println("Instance 1 ID : "+System.identityHashCode(singleton));
        System.out.println(singleton.getStrings());
        System.out.println(singleton.getSome(7));
        System.out.println(singleton.getStrings());

        System.out.println("------------------------------------------------------");

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Second Instance");
        System.out.println("Instance 2 ID : "+System.identityHashCode(singleton2));
        System.out.println(singleton2.getStrings());
        System.out.println(singleton2.getSome(7));
        System.out.println(singleton2.getStrings());
    }
}

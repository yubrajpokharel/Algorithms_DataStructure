package com.Patterns.Singleton;

/**
 * Created by yubraj on 7/12/16.
 */
public class MyThread implements Runnable{

    @Override
    public void run() {

        Singleton singleton = Singleton.getInstance();
        System.out.println("Instance ID : "+System.identityHashCode(singleton));
        System.out.println(singleton.getStrings());
        System.out.println(singleton.getSome(7));
        System.out.println("\n");
    }
}

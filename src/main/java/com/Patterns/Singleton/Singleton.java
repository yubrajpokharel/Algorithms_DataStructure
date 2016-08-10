package com.Patterns.Singleton;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by yubraj on 7/12/16.
 */
public class Singleton {
    private static Singleton instance = null;

    String[] scatteredLetters = {"y", "u", "b", "a", "r", "a", "j", "K", "l", "t", "o",
                                 "a", "h", "d", "w", "m", "n"};

    LinkedList<String> strings = new LinkedList<>(Arrays.asList(scatteredLetters));
    static Boolean firstThread = true;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            if(firstThread){
                firstThread = false;
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Singleton.class){
                if(instance == null) {
                    instance = new Singleton();
                }
            }
            //uncomment avobe 3 lines to check it for threads and use below
            //instance = new Singleton();
        }
        return instance;
    }

    public LinkedList<String> getStrings(){
        return instance.strings;
    }

    public LinkedList<String> getSome(int num){
        LinkedList<String> strings1 = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            strings1.add(instance.strings.remove(0));
        }
        return strings1;
    }


}

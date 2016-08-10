package com.Logical;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yubraj on 7/10/16.
 */
public class Word_Frequency {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        String words = "I am am legend";
        String s[] = words.split(" ");

        for(String word : s){
            Integer input = myMap.get(word);
            input = (input == null) ? 1 : input+1;
            myMap.put(word, input);
        }

        System.out.println(myMap);

    }
}

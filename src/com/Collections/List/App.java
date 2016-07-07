package com.Collections.List;

import java.util.*;

/**
 * Created by yubraj on 7/7/16.
 */
public class App {
    public static void main(String[] args) {
        List<Integer>  myArrayList = Collections.synchronizedList( new ArrayList<Integer>());
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);
            myArrayList.add(5);
            myArrayList.add(6);
            myArrayList.add(7);
        System.out.println("ArrayList : "+myArrayList.toString());



        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(4);
        integers.add(2);
        System.out.println("HashSet : " +integers.toString());

        LinkedHashSet<Integer> integers1 = new LinkedHashSet<>();
        integers1.add(1);
        integers1.add(4);
        integers1.add(2);
        System.out.println("LinkedHashSet : " + integers1.toString());


    }
}
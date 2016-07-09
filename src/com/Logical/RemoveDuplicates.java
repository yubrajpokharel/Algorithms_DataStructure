package com.Logical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubraj on 7/9/16.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerList.add(2);
            integerList.add(3);
            integerList.add(2);
            integerList.add(4);
            integerList.add(2);
            integerList.add(4);
        }
        System.out.println(integerList.toString());
        List<Integer> integerList1 = new ArrayList<>();
        integerList1 = removeDuplicates(integerList);
        System.out.println(integerList1.toString());

    }

    private static List<Integer> removeDuplicates(List<Integer> integerList) {
        List<Integer> integers = new ArrayList<>();      // 1
        for (int i = 0; i < integerList.size(); i++) {   // 1+n
            if(!integers.contains(integerList.get(i))){   // n
                integers.add(integerList.get(i));
            }
        }
        return integers;
    }

}

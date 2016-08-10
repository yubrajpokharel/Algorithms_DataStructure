package com.Logical;

import java.util.HashMap;

/**
 * Created by yubraj on 7/9/16.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<Character, Integer> formula = new HashMap<>();
        formula.put('I',1);
        formula.put('V',5);
        formula.put('X',10);
        formula.put('L',50);
        formula.put('C',100);
        formula.put('D',500);
        formula.put('M',1000);

        String s = "MMXV";
        int number = getInteger(formula, s);
        System.out.println(number);

    }

    private static int getInteger(HashMap<Character, Integer> formula, String s) {
        int sum = 0;
        int pre = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int curr = formula.get(s.charAt(i));
            if(i == 0){
                pre = curr;
            }else if(pre < curr){
                curr = curr - 2*pre;
                pre = curr;
            }else{
                pre = curr;
            }

            sum += pre;
        }

        return sum;
    }
}

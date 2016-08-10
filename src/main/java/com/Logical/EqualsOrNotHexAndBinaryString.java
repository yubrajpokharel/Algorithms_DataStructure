package com.Logical;

/**
 * Created by yubraj on 8/10/16.
 */
public class EqualsOrNotHexAndBinaryString {

    public static void main(String[] args) {
        System.out.println(checkTwoBaseNumber_Bin_Hex("100011", "abcd12"));
    }

    public static boolean checkTwoBaseNumber_Bin_Hex(String s1, String s2){
        int bin = convertToBase(s1, 2);
        int hex = convertToBase(s2, 16);
        System.out.println("Binary : " +bin);
        System.out.println("Hexadecimal : " +hex);

        boolean result = (bin == hex) ? true:false;
        return result;
    }

    public static int digitToInt(char c){
        if(c >= '0' && c <= '9') return c - '0';
        else if(c >= 'A' && c <= 'F') return 10 + c - 'A';
        else if(c >= 'a' && c <= 'f') return 10 + c - 'a';
        return -1;
    }

    public static int convertToBase(String no, int base){
        if(base < 2 || (base > 10 && base != 16)) return -1;

        int value = 0;
        for(int i = no.length() -1; i >= 0; i--){
            int digit = digitToInt(no.charAt(i));
            if (digit < 0 || digit >= base) {
                return -1;
            }
            int exp = no.length() - 1 - i;
            value += digit*Math.pow(base, exp);
        }

        return value;
    }
}

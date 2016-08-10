package com.Logical.StackUsingArray;

/**
 * Created by yubraj on 7/12/16.
 */
public class App {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new MyStack<>(10);

       // System.out.println("Top : "+ integerStack.top());

        integerStack.push(12);
        integerStack.push(13);
        integerStack.push(15);

        System.out.println("Top : "+integerStack.top());
        System.out.println("Pop : "+integerStack.pop());
        System.out.println("Top : "+integerStack.top());

        System.out.println("Size : " + integerStack.size());

    }
}

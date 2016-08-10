package com.Logical.StackUsingArray;

/**
 * Created by yubraj on 7/12/16.
 */
public class MyStack<T> implements Stack<T> {

    public int size;
    public int DEFAULT_SIZE = 16;
    public int top = -1;
    public Object[] elements;

    public MyStack(int size){
        this.size = size;
        elements = new Object[this.size];
    }

    public MyStack(){
        elements = new Object[DEFAULT_SIZE];
    }

    @Override
    public void push(T t) {
        if(size() == size) System.out.println("Stack Full Exception");
        elements[++top] = t;
    }

    @Override
    public T pop() {
        if(top == -1) System.out.println("Stack Empty Exception");
        T t1 = (T) elements[top];
        elements[top--] = null;
        return t1;
    }

    @Override
    public T top() {
        if (top == -1) System.out.println("Empty Stack No Top Exception");
        return (T) elements[top];
     }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1)? true : false;
    }
}

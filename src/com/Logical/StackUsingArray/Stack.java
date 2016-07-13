package com.Logical.StackUsingArray;

/**
 * Created by yubraj on 7/12/16.
 */
public interface Stack<T> {

    public void push(T t);
    public T pop();
    public T top();
    public int size();
    public boolean isEmpty();

}

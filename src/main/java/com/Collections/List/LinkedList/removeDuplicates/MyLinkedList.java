package com.Collections.List.LinkedList.removeDuplicates;

/**
 * Created by yubraj on 8/10/16.
 */
public class MyLinkedList {
    public int data;
    public MyLinkedList next;

    public MyLinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    public void appendAtTail(int data){
        MyLinkedList myLinkedList = new MyLinkedList(data);
        MyLinkedList current = this;
        while (current.next != null){
            current = current.next;
        }
        current.next = current;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyLinkedList getNext() {
        return next;
    }

    public void setNext(MyLinkedList next) {
        this.next = next;
    }
}

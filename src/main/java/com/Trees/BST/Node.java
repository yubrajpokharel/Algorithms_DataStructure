package com.Trees.BST;

/**
 * Created by yubraj on 7/8/16.
 */
public class Node {
    int key;
    String name;

    Node leftNode;
    Node rightNode;

    Node(int key, String name){
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{ " +
                "key = " + key +
                ", name = '" + name + '\'' +
                '}';
    }
}

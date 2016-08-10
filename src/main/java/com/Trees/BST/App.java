package com.Trees.BST;

/**
 * Created by yubraj on 7/8/16.
 */
public class App {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.addNode(40, "fourty");
        bst.addNode(60, "sixty");
        bst.addNode(70, "seventy");
        bst.addNode(65, "sixFive");
        bst.addNode(50, "fifty");

        bst.inOrderTraverse(bst.root);
        bst.preOrderTraverse(bst.root);

    }
}

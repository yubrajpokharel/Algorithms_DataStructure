package com.Trees.BST.SimpleBinary;

/**
 * Created by yubraj on 8/14/16.
 */
public class BinaryTree {
    Node node;

    public BinaryTree(Node node) {
        this.node = node;
    }

    public BinaryTree() {
        this.node = null;
    }

    public void addItem(int key){
        Node newNode = new Node(key);
        if(node == null){
            node = newNode;
        }else {
            Node focusNode = node;
            Node parent;

            while (true){
                parent = focusNode;

                if(key < parent.getLeft().getData()){
                    focusNode = focusNode.getLeft();
                    if(focusNode == null){
                        parent.setLeft(newNode);
                        return;
                    }
                }else{
                    focusNode = focusNode.getRight();
                    if(focusNode == null){
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    public static int findMax(Node node){
        if(node == null)
            return -1;

        int root = node.getData();
        int left = findMax(node.getLeft());
        int right = findMax(node.getRight());

        if(left > right)
            root = left;
        else
            root = right;

        return root;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addItem(2);
        tree.addItem(4);
        tree.addItem(1);
        tree.addItem(6);
        tree.addItem(8);

        System.out.println(tree.findMax(tree.node));
    }

}

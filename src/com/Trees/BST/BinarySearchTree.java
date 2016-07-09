package com.Trees.BST;

/**
 * Created by yubraj on 7/8/16.
 */
public class BinarySearchTree {

    Node root;

    public void addNode(int key, String name){
        Node newNode = new Node(key, name);

        if(root == null){
            root = newNode;
        }else{
            Node focusNode = root;
            Node parent;

            while (true){
                parent = focusNode;

                if(key < focusNode.key){
                    focusNode = focusNode.leftNode;
                    if(focusNode == null){
                        parent.leftNode = newNode;
                        return;
                    }
                }else{
                    focusNode = focusNode.rightNode;
                    if(focusNode == null){
                        parent.rightNode = newNode;
                        return;
                    }
                }
            }
        }

    }

    public void inOrderTraverse(Node node){
        if(node != null){
            inOrderTraverse(node.leftNode);
            System.out.println(node);
            inOrderTraverse(node.rightNode);
        }
    }

    public void preOrderTraverse(Node node){
        if(node != null){
            System.out.println(node);
            preOrderTraverse(node.leftNode);
            preOrderTraverse(node.rightNode);
        }
    }

    public boolean remove(int key){
        Node focusNode = root;
        Node parent = root;

        boolean isItALeftChild = true;

        while(focusNode.key != key){
            parent = focusNode;
            if(key < focusNode.key){
                isItALeftChild = true;
                focusNode = focusNode.leftNode;
            }else{
                isItALeftChild = false;
                focusNode = focusNode.rightNode;
            }

            if(focusNode == null) return false;
        }

        if(focusNode.leftNode == null && focusNode.rightNode == null){
            if(focusNode == root) root = null;
            else if(isItALeftChild) parent.leftNode = null;
            else parent.rightNode = null;
        }

        else if(focusNode.rightNode == null){
            if(focusNode == root) root = focusNode.leftNode;
            if(isItALeftChild) parent.leftNode = focusNode.leftNode;
            else parent.rightNode = focusNode.leftNode;
        }

        else if(focusNode.leftNode == null){
            if(focusNode == root) root = focusNode.rightNode;
            if(isItALeftChild) parent.leftNode = focusNode.rightNode;
            else parent.rightNode = focusNode.rightNode;
         }
        else{
//            Node replacement = getReplacementNode(focusNode);
//            if (focusNode == root)
//                root = replacement;
//            else if (isItALeftChild)
//                parent.leftNode = replacement;
//            else
//                parent.rightNode = replacement;
//
//            replacement.leftNode = focusNode.leftNode;
        }
        return true;




    }

}

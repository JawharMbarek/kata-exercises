package com.myself.trees;


import java.util.Deque;
import java.util.LinkedList;

public class BinaryTree {

    public BinaryTree left;
    public String value;
    public BinaryTree right;

    public BinaryTree(String value) {
        this.value = value;
    }

    public static String breadthFirstTraversal(BinaryTree root){
        StringBuilder accumulator = new StringBuilder("");
        Deque<BinaryTree> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTree node = queue.removeFirst();
            accumulator.append(node.value);
            if(node.left != null)
                queue.addLast(node.left);
            if(node.right != null)
                queue.addLast(node.right);
        }
        return accumulator.toString();
    }

}


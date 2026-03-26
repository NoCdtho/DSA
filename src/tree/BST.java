package tree;

import org.w3c.dom.ls.LSOutput;

//The code defines a BST class that allows you to create and manage a tree of nodes, where
// each node holds an integer value. The structure ensures that for any given node, all values
// in its left subtree are smaller, and all values in its right subtree are larger.

public class BST {

    public class Node{
        private int value;
        Node right;
        Node left;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BST(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        if(value < node.getValue()){
            node.left = insert(node.left, value);
        }
        if(value > node.getValue()){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums){
        populatedSorted(nums, 0, nums.length);
    }
    public void populatedSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start + end)/2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root, "Root node: ");
    }

    public void display(Node node, String details){
        if(node == null) return;

        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");

    }

    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node == null) return;
        System.out.println(node.value +  " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node == null) return;
        preOrder(node.left);
        System.out.println(node.value +  " ");
        preOrder(node.right);
    }

    public void postOrder(){
        inOrder(root);
    }
    public void PostOrder(Node node){
        if(node == null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value +  " ");
    }

}

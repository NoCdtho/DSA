package tree;

import java.util.*;

public class BinaryTree {

    public BinaryTree(){
    }

    class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    private Node root;
    //Insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root element: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    public void populate(Scanner scanner, Node node){
        System.out.println("do you want a left child? " + node.val);
        Boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("enter the value: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("do you want a right child? " + node.val);
        Boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter the value: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void lovelyDisplay(){
        display(root, 0);
    }
    public void display(Node node, int level){
        if(node == null){
            return;
        }

        display(node.right, level+1);

        if(level != 0){
            for(int i = 0; i < level -1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        }
        else{
            System.out.println(node.val);
        }
        display(node.left, level+1);
    }

}

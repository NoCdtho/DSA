package Linkedlist;

public class cll {
    private Node head;
    private Node tail;
    private int size;

    cll(){
        this.head = null;
        this.tail = null;
    }
     public void insertLast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
     }

     public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " --> ");
                node = node.next;
            }while(node != head);
        }
         System.out.println("head");
     }

     public int delete(int val){
        Node node = head;
        if(node.val == val){
            int value = node.val;
            head = node.next;
            tail.next = head;
            return value;
        }
        do{
            node = node.next;
            if(node.val == val){
                head.next  = node.next;
                break;
            }
            node = node.next;
        }while(node != head);
        return val;
    }

    private class Node{
        int val;
        Node node;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
}

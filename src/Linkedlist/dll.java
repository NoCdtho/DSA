package Linkedlist;

public class dll {
     Node head;
     Node tail;
    int size;
    dll(){
        this.size = 0;
    }

    public void insertfirst(int value){
        Node temp = new Node(value);
        temp.next = head;
        temp.prev = null;
        if(head != null){
            head.prev = temp;
        }
        head = temp;
        size++;
    }

    public void insertlast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            return;
        }
        Node last = get(size-1);
        if(last.next == null){
            last.next = node;
            node.prev = last;
        }
    }



    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.val == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insert(int value, int previous){
        Node node = new Node(value);
        Node node2 = find(previous);
        if(node2 == null){
            System.out.println("not a valid node");
            return;
        }
        node.next = node2.next;
        node2.next.prev = node;
        node2.next = node;
        node.prev = node2;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " --> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void revdisplay(){
        Node node  = get(size - 1);
        while(node != null){
            System.out.print(node.val + " ---<: ");
            node = node.prev;
        }
        System.out.println("start");
    }

    public int deleteLast(){
        Node NodeBeforeLast = get(size-2);
        int val = tail.val;
        tail = NodeBeforeLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleleFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index){
        Node node = get(index-1);
        int val = node.next.val;
        node.next = node.next.next;
        return val;
    }

    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

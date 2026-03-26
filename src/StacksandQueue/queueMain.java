package StacksandQueue;

public class queueMain {
    public static void main(String[] args) throws Exception {
        customQueue queue = new customQueue();
        queue.insert(3);
        queue.insert(32);
        queue.insert(31);
        queue.insert(33);
        queue.insert(45);

        queue.display();
        System.out.println(queue.remove());
        queue.display();

        System.out.println();

        circularQueue queue1 = new circularQueue();
        queue1.insert(31);
        queue1.insert(23);
        queue1.insert(32);
        queue1.insert(11);
        queue1.insert(43);

        queue1.display();
        System.out.println(queue1.remove());
        queue1.display();
        queue1.insert(555);
        queue1.display();
    }
}

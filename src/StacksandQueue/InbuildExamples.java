package StacksandQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class InbuildExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(23);
        stack.push(1);
        stack.push(43);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(35);
        queue.add(15);
        queue.add(54);
        queue.add(32);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }

}

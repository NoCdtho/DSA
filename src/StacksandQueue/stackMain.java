package StacksandQueue;

public class stackMain {
    public static void main(String[] args) throws stackException {
        dynamicStack stack1 = new dynamicStack(5);
        stack1.push(34);
        stack1.push(23);
        stack1.push(1);
        stack1.push(43);
        stack1.push(54);
        stack1.push(70);


        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

    }
}

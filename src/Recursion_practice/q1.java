package Recursion_practice;

// To print 1 to 5 using recusion

public class q1 {
    public static void main(String[] args) {
    call(5);
    }
    //My code
    static void call(int input){
        if(input == 1){
            System.out.println(input);
            return;
        }
        System.out.println(input);
        call(input -1);
    }
    //Kunal code
    static void call2(int input){
        if(input == 0){
            return;
        }
        System.out.println(input);
        call(input -1);
    }
}

package Recursion_practice;

//input = remains same but have to print 1 to 5

public class q2 {
    public static void main(String[] args) {
        callRev(5);
    }
    static void callRev(int input){
        if(input == 0){
            return;
        }
        callRev(input - 1);
        System.out.println(input);
    }
}

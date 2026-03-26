package Recursion_practice;

public class palindrom_recursion {

    static boolean palin(int num){
//        int rev = rev(num, 0);
//        if(num == rev){
//            return true;
//        }
//        else{
//            return false;
//        }
        return num == rev(num, 0);
    }

    static int rev(int num, int rev){
        if(num == 0){
            return rev;
        }
        int rem = num % 10;
        return rev(num/10, rev * 10 + rem);
    }

    public static void main(String[] args) {
        System.out.println(palin(132231));
    }
}

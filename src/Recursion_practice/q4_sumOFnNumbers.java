package Recursion_practice;

public class q4_sumOFnNumbers {
    public static void main(String[] args) {
        System.out.println(Sumofnum(6));
        SoN(5,0);
    }
    static int Sumofnum(int num){
        if(num <= 1){
            return num;
        }
        return num + Sumofnum(num - 1);
    }
    static void SoN(int num, int result){
        if(num < 1){
            System.out.println(result);
            return;
        }
        SoN(num - 1, result + num);
    }
}

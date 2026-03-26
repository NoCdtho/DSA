package Recursion_practice;

public class Count_Zeros {

    //without recursion:
    static void count(int num){
        int count = 0;

        //want to access each integer at one per time
        for(char ch: Integer.toString(num).toCharArray()){
            //eg: 1234 ---> ['1', '2', '3', '4']
            int digit = ch - '0';
            //eg ch = '1' then digit = 1
            if(digit == 0 ){
                ++count; // increases then assignes
            }

        }
        System.out.println(count);
    }

    //with recursion
    static int count2(int num, int digit){

        if(num % 10 == 0){
            ++digit;
        }
        if(num % 10 == num){
            return digit;
        }
        return count2(num/10, digit);
    }

    //better version of count2
    static int count3(int num, int digit){

        if(num  == 0){
            return digit;
        }
        if(num % 10 == 0){
            ++digit;
        }
        return count3(num/10, digit);
    }

    public static void main(String[] args) {
//        count(1000);
        System.out.println(count3(10002, 0));
    }
}

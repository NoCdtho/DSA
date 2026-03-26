package String;

import java.util.*;

public class String_Palindrom {
    public static void main(String[] args) {
        //Input function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String input = sc.nextLine();

        StringBuilder db = new StringBuilder(input);
        System.out.println(checkPalindrom(db));
    }
    static boolean checkPalindrom(StringBuilder input){
        if(input == null || input.length() == 0 ){
            return true;
        }
         //step1: convert into an array of characters:=
         //sample code:
         // StringBuilder sb = new StringBuilder("Hello World");
         //char[] charArray = sb.toString().toCharArray();
         //System.out.println(java.util.Arrays.toString(charArray));
         //step2: start checking from the first element and last element till the same element
    int left = 0, right = input.length() - 1;

    while(left < right){
        if(input.charAt(left) != input.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}

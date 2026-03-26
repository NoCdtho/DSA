package String.RecursionGoogleAmazonQuestion;
import java.util.*;
public class phonepad {
        public static void main(String[] args) {
//         combination("", "12");

            System.out.println(combination1("", "123"));
        }

        static void combination(String p, String up) {
            //base case
            if(up.isEmpty()){
                System.out.println(p);
                return;
            }
            //to use this expression the characters must be digits
            int digit  = up.charAt(0) -  '0';
            for(int i = (digit -1) * 3; i < digit * 3; i++ ){
                //convert i into string
                char ch =  (char)('a' + i);
                combination(p+ch, up.substring(1));
            }
        }

        //returning in arraylist
        static ArrayList<String> combination1(String p, String up) {

            ArrayList<String> ans = new ArrayList<>();
            //base case
            if(up.isEmpty()){
                ans.add(p);
                return ans;
            }
            //to use this expression the characters must be digits
            int digit  = up.charAt(0) -  '0';
            for(int i = (digit -1) * 3; i < digit * 3; i++ ){
                //convert i into string
                char ch =  (char)('a' + i);
                ans.addAll(combination1(p+ch, up.substring(1)));
            }
            return ans;
        }
    }

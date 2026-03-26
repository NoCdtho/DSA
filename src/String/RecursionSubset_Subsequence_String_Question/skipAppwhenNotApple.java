package String.RecursionSubset_Subsequence_String_Question;

public class skipAppwhenNotApple {

    public static void main(String[] args) {
        System.out.println(skipapp("appimahuman"));
    }

    static String skipapp(String a){
        if(a.isEmpty()) {
            return "";
        }
        if(a.startsWith("app") && !a.startsWith("apple")){
            return skipapp(a.substring(3));
        }
        else{
            return a.charAt(0) + skipapp(a.substring(1));
        }
    }
}

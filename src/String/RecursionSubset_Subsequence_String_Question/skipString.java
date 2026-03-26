package String.RecursionSubset_Subsequence_String_Question;

public class skipString {
    public static void main(String[] args) {
        System.out.println(skip1("appleimahuman"));
    }
    static String skip1(String a){
        if(a.isEmpty()){
            return "";
        }

        //New method startswith
        if(a.startsWith("imahuman")){
            return skip1(a.substring(8));
        }
        else{
            return a.charAt(0) + skip1(a.substring(1));
        }
    }
}

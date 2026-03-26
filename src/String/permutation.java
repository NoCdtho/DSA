package String;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
//        permutations("", "abc");
        System.out.println(permutations2("", "abc"));
        System.out.println(permutations3("", "abc"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
        String l = p.substring(0, i);
        String r = p.substring(i, p.length());
        permutations(l + ch + r, up.substring(1));
        }
    }
    //returnoing arraylist
    static ArrayList<String> permutations2(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String l = p.substring(0, i);
            String r = p.substring(i, p.length());
            list.addAll(permutations2(l + ch + r, up.substring(1)));
        }
        return list;
    }

    //counting the number of permutation
    static int permutations3(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int sum = 0;
        for(int i = 0; i <= p.length(); i++){
            String l = p.substring(0, i);
            String r = p.substring(i, p.length());
            sum = sum + permutations3(l + ch + r, up.substring(1));
        }
        return sum;
    }
}

package Searching.BINARYSEARCH.LINEARSEARCH;

public class Searchinstring {
    public static void main(String[] args) {
        String name = "Rohit";
        char item = 'R';
//        System.out.println(search(name,item));
        System.out.println(search2(name,item,1,3));
    }
    static boolean search(String name, char item) {
        for (char c : name.toCharArray()){ // enhanced for loop
            if(c == item){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String name, char item, int start, int end){
        if(name.isEmpty()){
            return false;
        }
        for(int index = 0; index < name.length(); index++){
            if(item == name.charAt(index)){
            return true;
            }
        }
        return false;
    }
}


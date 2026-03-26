package String;

public class Printing_AtoB {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String series = " ";
        for(int i = 0; i < 26 ; i++){
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
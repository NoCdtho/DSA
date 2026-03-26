package Backtracking;
import java.util.*;
public class pathAndMatrix {
    public static void main(String[] args) {
        boolean[][] thewall = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] jake = new int[thewall.length][thewall[0].length];
        mazerunner(0, 0, thewall, jake, 1, "");
    }

    private static void mazerunner(int r, int c, boolean[][] mazze, int[][] path, int count, String p) {

        //base case
        if (r == mazze.length - 1 && c == mazze[0].length - 1) {
            path[r][c] = count;
            for(int[] num: path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!mazze[r][c]){
            return;
        };
        //finding the path in maze marking so that I can find the correct paths
        //this line means if the cell is true make it false
        //I am going through here marking path
        mazze[r][c] = false;
        path[r][c] = count;

        if (r < mazze.length - 1) {
             mazerunner(r + 1, c, mazze, path, count+1, p + "D");
        }
        if (c < mazze[0].length - 1) {
            mazerunner(r, c + 1, mazze, path, count+1, p+"R");
        }
        if (c > 0) {
            mazerunner(r, c - 1, mazze, path,count+1, p+ "L");
        }
        if (r > 0) {
           mazerunner(r - 1, c, mazze, path,count+1, p+"U");
        }
        mazze[r][c] = true;
        path[r][c] = 0;
    }
}

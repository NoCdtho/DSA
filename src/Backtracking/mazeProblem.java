package Backtracking;
import java.util.*;
public class mazeProblem {
    public static void main(String[] args) {
//       System.out.println(maze(3, 3));
//       maze2(3, 3, "");
//       System.out.println(maze3(3,3,""));
//        System.out.println(maze4(3,3,""));
//        System.out.println(maze5(3,3));
        boolean[][] block = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        maze6(0, 0, block, "");
    }
    //my way
    public static int  maze(int right, int left){
        //base case
        if(left == 1 || right == 1){
            return 1;
        }
        int sum = 0;
        while(right > 1){
            sum = sum + maze(right -1, left);
            right--;
        }
        while(left > 1){
            sum = sum + maze(right, left -1);
            left--;
        }
        return sum;
    }

    //kunals way
    public static int maze5(int left, int right){
        //base case
        if(left == 1 || right == 1){
            return 1;
        }
        int L= maze5(left -1, right);
        int R = maze5(left, right -1);
        return L+R;
    }

    //printing the path
    public static void maze2(int r, int c, String path){
        if(r == 1 && c == 1){
            System.out.println(path);
            return;
        }
        if(r > 1) {
            maze2(r - 1, c, path + 'd');
        }
        if(c > 1){
            maze2(r, c-1, path + 'r');
        }
    }

    //returning in arraylist
    public static ArrayList<String> maze3(int r, int c, String path){
        ArrayList<String> list = new ArrayList<>();
        if(r == 1 && c == 1){
            list.add(path);
        return list;
        }
        if(r > 1) {
             list.addAll(maze3(r - 1, c, path + "d"));
        }
        if(c > 1){
           list.addAll(maze3(r, c-1, path + 'r'));
        }
        return list;
    }

    //adding 1 more direction to move
    public static ArrayList<String> maze4(int r, int c, String path){
        ArrayList<String> list = new ArrayList<>();
        if(r == 1 && c == 1){
            list.add(path);
            return list;
        }
        if(r > 1) {
            list.addAll(maze4(r-1, c, path + 'r'));
        }
        if(c > 1){
            list.addAll(maze4(r, c-1, path + 'r'));
        }
        if(r>1 && c >1){
            list.addAll(maze4(r-1, c-1, path + 'D'));
        }
        return list;
    }

    //adding a problem a river in the maze this time the maze will boolean and a 2d array
    static void maze6(int r, int c, boolean[][] mazze, String path){
        //base case
        if(r == mazze.length - 1 && c == mazze[0].length -1){
            System.out.println(path);
            return;
        }
        //if u fall in  river
        if(!mazze[r][c]){
            return;
        }
        if(r < mazze.length - 1){
            maze6(r+1, c, mazze, path+"R");
        }
        if(c < mazze[0].length -1){
            maze6(r, c+1, mazze, path+"D");
        }
    }
}

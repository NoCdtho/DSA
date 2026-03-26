package Backtracking;

public class allPath {
    public static void main(String[] args) {
        boolean[][] block = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allpaths(0, 0, block, "");
    }

    //only printing the path
    static void allpaths(int r, int c, boolean[][] mazze, String path){
        //base case
        if(r == mazze.length - 1 && c == mazze[0].length -1){
            System.out.println(path);
            return;
        }
        if(!mazze[r][c]){
            return;
        }
        //finding the path in maze marking so that I can find the correct paths
        //this line means if the cell is true make it false
        //I am going through here marking path
        mazze[r][c] = false;

        if(r < mazze.length - 1){
            allpaths(r+1, c, mazze, path+"D");
        }
        if(c < mazze[0].length -1){
            allpaths(r, c+1, mazze, path+"R");
        }
        if(c > 0){
            allpaths(r, c-1, mazze, path+"L");
        }
        if(r > 0){
            allpaths(r-1, c, mazze, path+"U");
        }
        mazze[r][c] = true;
    }

}

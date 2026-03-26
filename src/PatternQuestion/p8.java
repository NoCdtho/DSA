package PatternQuestion;
//Required pattern
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

//first try
//4 4 4 4 4 4 4 4 4
//4 3 3 3 3 3 3 3 4
//4 3 2 2 2 2 2 3 4
//4 3 2 1 1 1 2 3 4
//4 3 2 1 0 1 2 3 4
//4 3 2 1 1 1 2 3 4
//4 3 2 2 2 2 2 3 4
//4 3 3 3 3 3 3 3 4
//4 4 4 4 4 4 4 4 4

//Second try
//5 5 5 5 5 5 5 5 5
//5 4 4 4 4 4 4 4 5
//5 4 3 3 3 3 3 4 5
//5 4 3 2 2 2 3 4 5
//5 4 3 2 1 2 3 4 5
//5 4 3 2 2 2 3 4 5
//5 4 3 3 3 3 3 4 5
//5 4 4 4 4 4 4 4 5
//5 5 5 5 5 5 5 5 5

//final pattern
//4 4 4 4 4 4 4 4 4
//4 3 3 3 3 3 3 3 4
//4 3 2 2 2 2 2 3 4
//4 3 2 1 1 1 2 3 4
//4 3 2 1 1 1 2 3 4
//4 3 2 1 1 1 2 3 4
//4 3 2 2 2 2 2 3 4
//4 3 3 3 3 3 3 3 4
//4 4 4 4 4 4 4 4 4

public class p8 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n){
    int numberAtindex;
    int originalN = n;
        n = 2 * n;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col <= n; col++){

              numberAtindex = originalN - Math.min(Math.min(col, row), Math.min(n - col, n - row));
                if(col == n/2 && row == n/2){
                    System.out.print("1 ");
                }
                else {
                    System.out.print(numberAtindex + " ");
                }
            }
            System.out.println();
        }
    }
}

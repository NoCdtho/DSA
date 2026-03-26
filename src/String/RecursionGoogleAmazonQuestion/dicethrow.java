package String.RecursionGoogleAmazonQuestion;

//Target is to get 4 in dice
public class dicethrow {
    public static void main(String[] args) {
//        combo(" ", "123456", 0);
        comboDice("", 4);
    }

    //non-repeatation of numbers
    private static void combo(String p, String up, int sumSoFar){
        //base case
        if(up.isEmpty()){
            if(sumSoFar == 4 && !p.isEmpty()){
                System.out.println(p);
            }
            return;
        }
        //target is to make 4
        //first take the first number and convert it into integer
        char ch = up.charAt(0);
        int num = ch - '0';

        //make sure the number that comes in p makes the
        // total sum of processed  4 or less than it
        if(num + sumSoFar <= 4){
            combo(p + ch, up.substring(1), sumSoFar + num);
        }
        //exclude if the num exceeds the sum of 4
        combo(p, up.substring(1), sumSoFar);
    }

    //repeatation of numbers allowed
    private static void comboDice(String p, int target){
        if(target  == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= 6; i++){
            if(i <= target){
                comboDice(p + i, target - i);
            }
        }
    }
}

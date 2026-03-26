package TestAttempt;
import java.util.*;

//check notion for the question ✅ | working
public class scalerTest {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(nums));
        System.out.println(ans(nums));
        System.out.println(maxAndMinAdd(nums));

    }
    public static int maxAndMinAdd(int[] arr){
        int sum = 0;
        List<List<Integer>> list = ans(arr);
        for(List<Integer> inner: list){
            int difference = Collections.max(inner) - Collections.min(inner);
            sum += difference;
        }

        return sum;
    }

    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++){
            int n = outer.size();
            for(int j = 0; j < n; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));/// copy the previous list
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    //subset with continuous element
    public static List<List<Integer>> ans (int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            List<Integer> current = new ArrayList<>();
            for(int j = i; j <nums.length; j++){
                current.add(nums[j]);
                outer.add(new ArrayList<>(current));
            }
        }
        return outer;
    }
}

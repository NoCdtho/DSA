package Sorting.Cycle_Sort_and_Amazon_Google_Microsoft_Interview_Questions;
import java.util.*;

public class MoreThanOneDublicates442 {

    public static void main(String[] args) {
    int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    static public List<Integer> findDuplicates(int[] nums) {
        //range of the number is 1 to n
        List<Integer> list = new ArrayList<>();
        //sort the function
        int index = 0;
        while(index < nums.length){
        if(nums[index] != index+1){
            int correctindex = nums[index] - 1;
            if(nums[correctindex] != nums[index]){
                swap(nums, index, correctindex);
            }
            else{
                list.add(nums[index]);
                ++index;//add the element if its present in its coorectposition
            }
        }
        else{
            ++index;
        }
        }
        return list;
    }
    //swap the function
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

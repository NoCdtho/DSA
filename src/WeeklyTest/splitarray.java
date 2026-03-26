package WeeklyTest;

public class splitarray {
    public static void main(String[] args) {
    int []nums = {7,2,5,10,8};
        System.out.println(splitArray(nums, 2));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1; //pieces is the number of subarrays
            for (int num : nums) { //iteration of the array and converting into subarrays
                if (sum + num > mid) {
                    //make a new sub_array
                    sum = num; //add the new number to the new subarray.
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
//where is the code is able to find the minimized largest sum is not clear

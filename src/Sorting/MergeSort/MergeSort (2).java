import java.util.Arrays;

    public static void main(String[] args) {
        int[] arr = {7, 4, 8, -3, 2, 1};
        int[] ans = mergeSortArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSortArray(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSortArray(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSortArray(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    //Function to merge two sorted array
    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n1 = first.length;
        int n2 = second.length;
        int[] arr = new int[n1 + n2];
        while (i < n1 && j < n2) {
            if (first[i] < second[j]) {
                arr[k] = first[i];
                i++;
            } else {
                arr[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < n1) { // problem is the the i should be indx after the both comparison are done.
            arr[k] = first[i];
            i++;
            k++;
        }
        //only one array will remain
        while (j < n2) {
            arr[k] = second[j];
            j++;
            k++;
        }
        return arr;
    }
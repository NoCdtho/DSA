package Recursion_practice;
import java.util.*;

public class Linear_Search_withMultipleOccurence {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 34, 5, 5, 18};
        int[] arr2 = {1, 2, 2, 3, 3, 34, 5, 5, 18};
        int target = 5;
        int target2 = 2;
        int target3 = 34;
        int index = 0;

        searchMultipleOccurence(arr, target, index); //if I  try to print this it would
        //return -1.
        System.out.println(list);// this is printing the list which is created by the function call
        // searchMultipleOccurence.

        searchMultipleOccurence2(arr2, target, index);
        System.out.println(searchMultipleOccurence3(arr, target2, index, list3));
        System.out.println(searchMultipleOccurence4(arr2, target2, index));
    }

    static  ArrayList<Integer> list = new ArrayList<>();
    static  ArrayList<Integer> list2 = new ArrayList<>();
    static  ArrayList<Integer> list3 = new ArrayList<>();


    //integer return and adding the index the list.
    static int searchMultipleOccurence(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return searchMultipleOccurence(arr, target, index + 1);
    }


    //In void so list2 is printed.
    static void searchMultipleOccurence2(int[] arr, int target, int index){
        if(index == arr.length){
            System.out.println(list2);
            return ;
        }
        if(arr[index] == target){
            list2.add(index);
        }
        searchMultipleOccurence2(arr, target, index + 1);
    }


    //Return the arraylist same thing but the arraylist is initialized differently
    //argument.
    static ArrayList<Integer> searchMultipleOccurence3(int[] arr, int target, int index, ArrayList<Integer> list3){
        if(index == arr.length){
            return list3;
        }
        if(arr[index] == target){
            list3.add(index);
        }
        return searchMultipleOccurence3(arr, target, index + 1, list3);
    }


    //If the return type is arraylist but no parameter is passed in the argumeter.
    static ArrayList<Integer> searchMultipleOccurence4(int[] arr, int target, int index){

        // A new list should be created each time the function is created
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> Allvalues = searchMultipleOccurence4(arr, target, index + 1);
        list.addAll(Allvalues);
        return list;
    }
}

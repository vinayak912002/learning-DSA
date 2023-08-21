package sorting_algorithms;

import java.util.Arrays;

public class Selection_sort {
    //In this algorithm we select the largest or smallest element and put it at last or in the beginning as per requirement
    static int largestElementIndex(int[] nums, int start, int end){
        int index = 0;
        for (int i = 0; i <= end;i++){
            if (nums[i] > nums[index]) index = i;
        }
        return index;
    }
    static int smallestElement(int[] nums, int start, int end){
        int index = 0;
        for (int i = 0; i <= end;i++){
            if (nums[i] < nums[index]) index = i;
        }
        return index;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
    static void selectionSortAsc(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            swap(arr, largestElementIndex(arr, 0, i), i);
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        selectionSortAsc(nums);
        System.out.println(Arrays.toString(nums));
    }
}

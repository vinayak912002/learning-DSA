package algorithms.sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums  = {8,7,6,5,4,3,2,1};
        int[] nums2  = {1,2,3,4,5,6,7,8};
        sortAsc(nums);
        sortDec(nums2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }
    static void sortAsc(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < (nums.length - 1) - i; j++){
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break; //if no number is swapped that means that all the elements are sorted
        }
    }
    static void sortDec(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < (nums.length - 1) - i; j++){
                if (nums[j] < nums[j + 1]) {
                    swap(nums, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}

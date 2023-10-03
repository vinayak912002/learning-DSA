package algorithms.sorting_algorithms;

import java.util.Arrays;

public class Quick_sort {

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    //there are going to be two pointers
    //one will move from beginning to end and one will move from end to the beginning
    //here we are going to use the middle element as a pivot.
    static void quickSort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }
            if(start <= end){//we are checking the condition again because it may happen that the condition is violated
                swap(nums, start, end);
                start++;
                end--;
            }
        }
        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }

    public static void main(String[] args) {
        int[] nums = {51,52,45,47,80};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}

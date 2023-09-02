package algorithms.sorting_algorithms;

import java.util.Arrays;

public class Merge_sort {

    static void merge(int[] nums, int start, int mid, int end){

        int n1 = mid - start + 1;//size of the first array
        int n2 = end - mid;//size of the second array

        //creating temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        //copying the data to the temp arrays
        for(int i = 0; i < n1 ; i++){
            left[i] = nums[start + i];
        }
        for(int j = 0; j < n2 ; j++){
            right[j] = nums[mid + 1 + j];
        }
        //merging the two subarrays
        //the pointer i will be for the left subarray
        //the pointer j will be for the right subarray
        int i = 0, j = 0;

        int k = start;//k will be the pointer for the original array
        //sorting will happen in the below while loop
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                nums[k] = left[i];
                i++;
            }else {
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        //copy the remaining elements into the original array
        while(i < n1){
            nums[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            nums[k] = left[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] nums, int start, int end){

        if (start < end){

            int mid = start + (end - start)/2;

            mergeSort(nums, start, mid);//the left branch of the recursion tree
            mergeSort(nums, mid + 1, end);//the right branch

            merge(nums, start, mid , end);
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        mergeSort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}

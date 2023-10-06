package algorithms.sorting_algorithms;

import java.util.Arrays;

public class Insertion_sort {
    // In insertion sort the leftmost element in each pass is put at its correct place.
    // Step 1 : [5,3],4,2,1 ==> 3,5,4,2,1
    // Step 2 : [3,5,4],2,1 ==> 3,4,5,2,1
    // Step 3 : [3,4,5,2],1 ==> 2,3,4,5,1
    // Step 4 : [2,3,4,5,1] ==> 1,2,3,4,5 and the list is sorted

//basically there are two pointers i and j
    //the i pointer keeps track of the size of the array in which we are currently working
    //the j pointer helps us to sort the array
    static void insertionSortAsc(int[] nums){
        for (int i = 1; i < nums.length; i++){
            int j = i - 1;
            int key = nums[i];
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
    static void insertionSortDesc(int[] nums){
        for (int i = 1; i < nums.length; i++){
            int j = i - 1;
            int key = nums[i];
            while(j >= 0 && nums[j] < key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int[] nums2 = {1,2,3,4,5};
        insertionSortAsc(nums);
        insertionSortDesc(nums2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }
}

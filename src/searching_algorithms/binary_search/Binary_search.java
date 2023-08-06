package searching_algorithms.binary_search;


//Binary search can only be applied if the numbers are arranged in ascending or descending order.
public class Binary_search {
    public static void main(String[] args) {
        int[] nums = {3,8,9,15,86,148};
        int[] nums2 = {23,13,10,4,3,2};
        System.out.println(agnostic_search(nums2, 4));
    }
    //The basic_search will work only if the given array is in ascending order.
    static int basic_search(int[] nums, int target){
        int start = 0;
        int end  = nums.length - 1;
        int mid =start + (end - start)/2;
//The condition is greater than equal to because when start will become equal to end and if the target is caught then we need to return it
        while(end >= start){
            mid = start + (end - start)/2;
            if(nums[mid]> target){
                end = mid - 1;
            } else if (nums[mid]< target) {
                start = mid + 1;
            }else return mid;
        }
        return -1;
    }
    // agnostic binary search algo
    static int agnostic_search(int[] nums, int target){
        int start = 0;
        int end  = nums.length - 1;
        int mid =start + (end - start)/2;

        if(nums[start] < nums[end]){
            while(end > start){
                mid = start + (end - start)/2;
                if(nums[mid]> target){
                    end = mid - 1;
                } else if (nums[mid]< target) {
                    start = mid + 1;
                }else return mid;
            }
        }else{
            while(end >= start){
                mid = start + (end - start)/2;
                if(nums[mid]> target){
                    start = mid + 1;
                } else if (nums[mid]< target) {
                    end = mid - 1;
                }else return mid;
            }
        }
        return -1;
    }
}

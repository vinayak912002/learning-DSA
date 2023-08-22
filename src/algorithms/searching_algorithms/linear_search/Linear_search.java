package algorithms.searching_algorithms.linear_search;

public class Linear_search {
    public static void main(String[] args) {
        int[] nums = {1,2,3,45,8,75,65};
        System.out.println(search_index(nums,75));
        System.out.println(search_index(nums,0));
    }
    static int search_index(int[] nums, int target){
        for(int i = 0; i< nums.length - 1; i++){
            if (nums[i] == target) return i;
        }
        return -1;//returns -1 if target not found.
    }
}

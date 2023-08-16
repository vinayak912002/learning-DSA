package searching_algorithms.binary_search.two_dimentional_array;

//to apply binary search in a two-dimensional array all of its elements must be arranged in order either-ascending or descending.
//in any searching algorithms trying to somehow reduce the search space is a good strategy.

import java.util.Arrays;
import java.util.EnumSet;

public class Binary_search {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };
        System.out.println(Arrays.toString(search(nums, 8)));
    }
    //our goal is to reduce the search space that we have to work on.
    static int[] search(int[][] matrix, int target){
        //we start our search from the last element of the first row.
        //r is row number and c is column number.
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target) return new int[]{r, c};
            if (matrix[r][c] > target) c--;
            if (matrix[r][c] < target) r++;
        }
        return new int[]{-1, -1};
    }
}


package searching_algorithms.binary_search.two_dimentional_array;

import java.util.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,5,6,7},
                {10,12,13,15}
        };
        System.out.println(Arrays.toString(search(matrix, 5)));
    }

    // we need a function to search within a row in the matrix within the specified bounds
    static int[] binarySearch(int matrix[][], int target, int row, int cStart, int cEnd){
        while (cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart)/2;
            if (matrix[row][cMid] == target){
                return new int[]{row, cMid};
            }
            if (matrix[row][cMid] > target){
                cEnd = cMid - 1;
            }
            if (matrix[row][cMid] < target){
                cStart = cMid + 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        //we need to know what kind of matrix do we have to search
        int rows = matrix.length;
        int cols = matrix[0].length;

        //if matrix is empty
        if (rows == 0 && cols == 0){
            return new int[]{-1, -1};
        }
        //if it is row matrix
        if (rows == 1){
            return binarySearch(matrix, target, 0, 0, cols - 1);
        }
        //if  it is  column matrix then will proceed as any other case
        // for all the other types of matrices
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while(rStart < (rEnd - 1)){//while this condition is true the matrix will have two rows

            int rMid = rStart + (rEnd - rStart)/2;

            if (matrix[rMid][cMid] == target){
                return new int[]{rMid, cMid};
            }
            if (matrix[rMid][cMid] > target){
                rEnd = rMid;
            }
            if (matrix[rMid][cMid] < target){
                rStart = rMid;
            }
        }
        //after this while loop only two rows will be left to search
        //first we check whether the target is on the current column of the two rows
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        //if the target is not on these two we have to search all the four parts of the array
        //the four parts are - the upper left and right parts, and the lower left and right parts
        if (target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }
        if (target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        }else{
            return binarySearch(matrix, target, rStart + 1, cMid + 1, cols - 1);
        }
    }
}
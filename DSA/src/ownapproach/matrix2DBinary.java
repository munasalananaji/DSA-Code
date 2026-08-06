package ownapproach;

import java.util.Arrays;

public class matrix2DBinary {
    static void main(String[] args) {
        int[][] arr = { {1,5,8,9},
                        {3,7,11,13},
                        {14,20,21,23},
                        {16,24,26,25}};
        System.out.println("The binary search of the element is "+ Arrays.toString(binary2dSearch(arr, 25)));
    }

    private static int[] binary2dSearch(int[][] arr, int target) {
        int row = 0;
        int col = arr.length-1;
        while(row<= col)
        {
            if(arr[row][col] == target)
            {
                return new int[]{row, col};
            } else if (target < arr[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }

        return new int[]{-1,-1};
    }

}

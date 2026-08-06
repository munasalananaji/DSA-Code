package matrixbinarysearch;

import java.util.Arrays;

public class RowWiseColWiseSortedMatrix {
    static void main(String[] args) {
        /*Matrix is sorted in row and column wise */
        int[][] matrix = {
                {2,7,9,11},
                {3,8,12,16},
                {6,13,18,20},
                {10,19,24,30}
        };
        int[] result = searchInMatrix(matrix, 2);
        System.out.println("Print the result "+ Arrays.toString(result));
    }

    private static int[] searchInMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length-1;
        while (row <= matrix.length-1 && col >=0)
        {
            if(matrix[row][col]== target)
            {
                return new int[]{row, col};
            }
           if(matrix[row][col] > target)
           {
               col--;
           }
           else {
               row++;
           }
        }
      return new int[]{-1,-1};
    }
}

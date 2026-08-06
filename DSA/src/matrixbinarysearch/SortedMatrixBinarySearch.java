package matrixbinarysearch;

import java.util.Arrays;

public class SortedMatrixBinarySearch {
    static void main(String[] args) {
        //Below is the completed sorted matrix
        int[][] matrix = {
                {2,7,9,11},
                {13,16,20,22},
                {24,28,30,32},
                {36,40,43,49}
        };
        int[] result = searchInSortedMatrix(matrix, 50);
        System.out.println("The target element is at "+ Arrays.toString(result));
    }

    private static int[] searchInSortedMatrix(int[][] matrix, int target) {
        //Since this is complete sorted convert that into normal binary search
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0 , end = row*col-1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            int valueAtMid = matrix[mid/row][mid % col];
            if(valueAtMid == target)
            {
                return new int[]{mid/row,mid % col};
            }
            if(valueAtMid > target)
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return new int[]{-1,-1};

    }
}

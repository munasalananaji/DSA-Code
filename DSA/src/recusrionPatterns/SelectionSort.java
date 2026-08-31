package recusrionPatterns;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {2,21,12,8,3,5,19};
        selectionSortUsingRecursion(arr,0,0, arr.length-1);
        System.out.println("The sorted selection sort is "+ Arrays.toString(arr));
    }

    private static void selectionSortUsingRecursion(int[] arr,int maxIndex, int start, int end) {

        if(end ==0)
        {
            return;
        }
        if(start<=end)
        {
            if(arr[start]> arr[maxIndex])
            {
                maxIndex = start;
            }
            selectionSortUsingRecursion(arr, maxIndex, start+1, end);
        }
        else {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[end];
            arr[end]  = temp;
            selectionSortUsingRecursion(arr, 0, 0, end-1);

        }

    }
}

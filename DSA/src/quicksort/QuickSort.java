package quicksort;

import java.util.Arrays;

public class QuickSort {
    static void main(String[] args) {
        int[] arr =  {5,4,3,6,1,0};
        quickSort(arr, 0, arr.length-1);
        System.out.println("The quick sort elements from an array is "+ Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start<=end)
        {
            while(arr[start] < pivot)
            {
                start++;
            }
            while(arr[end]> pivot)
            {
                end--;
            }

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}

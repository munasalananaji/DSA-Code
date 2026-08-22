package cyclicsortalgorithm;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr ={2,-1,100,3,5,8,22};
        selectionSort(arr);
        System.out.println("The bubble sorted array is "+ Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for(int i =0 ;i<arr.length ;i++)
        {
            int end = arr.length-i-1;
            int maxIndex =   getMaxIndex(arr, end);
            swap(arr, maxIndex, end);
        }
    }

    private static void swap(int[] arr, int maxIndex, int end) {
      int temp = arr[maxIndex];
      arr[maxIndex] = arr[end];
      arr[end]= temp;
    }

    private static int getMaxIndex(int[] arr, int end) {
        int max = 0;
        for(int i =1; i<=end ;i++)
        {
            if(arr[i]> arr[max])
            {
                max = i;
            }
        }
        return max;
    }
}

package cyclicsortalgorithm;

import java.util.Arrays;

public class CycleSort {
    static void main(String[] args) {
        int[] arr ={5,2,3,1,4,10,8,6,7,9};
        cycleSort(arr);
        System.out.println("The Cycle sorted array is "+ Arrays.toString(arr));
    }

    private static void cycleSort(int[] arr) {
        int i =0;
        while(i<arr.length)
        {
            if((i+1) == arr[i])
            {
                i++;
            }
            else {
                swap(arr, i, arr[i]-1);
            }
        }
    }

    private static void swap(int[] arr, int first, int last) {
      int  temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
    }
}

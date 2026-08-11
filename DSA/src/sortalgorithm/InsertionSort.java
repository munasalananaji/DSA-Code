package sortalgorithm;

import java.util.Arrays;

public class InsertionSort {
    static void main(String[] args) {
        int[] arr ={2,100,3,5,8,22};
        sort(arr);
        System.out.println("The bubble sorted array is "+ Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        //Here we are running j from 1 to j+1 so making i-2
        for (int i =0; i< arr.length-1;i++)
        {
            for(int j =i+1; j> 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr, j , j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

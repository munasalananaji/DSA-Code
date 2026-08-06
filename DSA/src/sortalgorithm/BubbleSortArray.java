package sortalgorithm;

import java.util.Arrays;

public class BubbleSortArray {
    static void main(String[] args) {
        int[] arr ={2,100,3,5,8,22};
        sort(arr);
        System.out.println("The bubble sorted array is "+ Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        boolean isSwapped = false;
        for(int i =0 ; i< arr.length ;i++)
        {
            for(int j =1; j<arr.length-i;j++)
            {
                if(arr[j-1] > arr[j])
                {
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   isSwapped = true;
                }
            }
            //If it's never swapped in the inside loop then  we don't need to run for i times
            if(!isSwapped) break;

        }

    }
}

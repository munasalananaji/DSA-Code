package sortalgorithm;

import java.util.Arrays;

public class MissingNumber {
    static void main(String[] args) {
        int[] arr = {3,0,1};

       int missingNumbers = findSortingNumber(arr);
        System.out.println("The missing number in an array is  "+ missingNumbers);
    }

    private static int findSortingNumber(int[] arr) {

        int i =0;
        while(i<arr.length)
        {
            if(arr[i] == i || arr[i] >arr.length-1)
            {
                i++;
            }
            else {
                    swap(arr, i, arr[i]);
                }
            }
        for(int j =0; j< arr.length;j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {
       int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

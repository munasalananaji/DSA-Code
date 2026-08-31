package mergeSort;

import java.util.Arrays;

public class MergeSortArray {
    static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println("The merge sorted array is "+Arrays.toString(arr));
    }

    private static int[] mergeSort(int[] arr) {

        if(arr.length==1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(arr,left, right);
    }

    private static int[] merge(int[] arr, int[] first, int[] second) {
        int[] newArray = new int[first.length+ second.length];
        int i =0;
        int j=0;
        int k=0;
       while(i< first.length && j<second.length)
       {
           if(first[i]< second[j])
           {
               newArray[k] = first[i];
               i++;
           }
           else {
               newArray[k] = second[j];
               j++;
           }
           k++;
       }

       while(i< first.length)
       {
           newArray[k] = first[i];
           i++;k++;
       }
        while(j< second.length)
        {
            newArray[k] = second[j];
            j++;k++;
        }

    return  newArray;

    }
}

package mergeSort;

import java.util.Arrays;

public class MergeSortInPlace {
    static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        mergeSortInPlace(arr, 0, arr.length-1);
        System.out.println("The sorted array in place is "+ Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
        if(start>=end)
        {
            return;
        }
        int mid = start + (end-start)/2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start +1];
        int i = start, j = mid+1 , k =0;
        while(i<=mid && j<=end)
        {
            if(arr[i] <= arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<= mid)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<= end)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int x =0 ;x<mix.length;x++)
        {
            arr[start+x] = mix[x];
        }
    }
}

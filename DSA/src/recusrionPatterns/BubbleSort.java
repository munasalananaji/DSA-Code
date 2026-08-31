package recusrionPatterns;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        //Sort this array
        int[] arr = {2,12,8,3,5,19};
        sortUsingRecursion(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    //Use the same concept as triangle pattern
    //start = assume it as outer loop and end = asssume it as inner loop
    private static void sortUsingRecursion(int[] arr,int start,int end) {

        if(end==0)
        {
            return;
        }
        if(start<end)
        {
            if(arr[start]> arr[start+1])
            {
                //Swap the elements
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            sortUsingRecursion(arr,start+1,end);
        }
        else {
            sortUsingRecursion(arr,0, end-1 );
        }



    }
}

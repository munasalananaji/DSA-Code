package binarysearch;
/*cieling smallest num greater than or equal to target num
* 6>= smallest num among the largest numbers than target 6*/
public class Ceiling {

   public static void main(String[] args) {
        int arr[] = {2,5,8,12,14,16,17,21,28,30};
        int target = 32;

            System.out.println("The cieling from an array is "+ceilingNum(arr, target));


    }

    private static int ceilingNum(int[] arr, int target) {

       //if the target num is greater than the greatest num in the array
        if(target > arr[arr.length-1]) return -1;

       int start =0, end = arr.length-1;
       while(start<=end)
       {
           int mid = start + (end - start)/2;
           if(arr[mid] < target)
           {
               start = mid+1;
           }
           else if(arr[mid]> target)
           {
               end = mid -1;
           }
           else return mid;

       }
       return start;
    }


}

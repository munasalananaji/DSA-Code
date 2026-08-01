package ownapproach;

public class RotatedBinarySearch {

    static void main(String[] args) {
        int[] arr =  {7,8,9,1,2,3,4,5,6};
        int target = 3;
        System.out.println("Index of the targeted element is "+binarySearch(arr, target));
    }

    //Rotated sort guarantees one side sorted
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
           int mid = start + (end - start)/2;

           if(arr[mid] == target)
           {
               return mid;
           } else if (arr[mid] >= arr[start]) {
               //Check target lies in left ascending sorted array

               if(target < arr[mid] && target >= arr[start])
               {
                   end = mid-1;
               }
               else {
                   start = mid+1;
               }

           }
           else {
               //Check target lies in right descending sorted array
                if(target > arr[mid] && target <= arr[end])
                {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
           }

        }
        return-1;
    }
}

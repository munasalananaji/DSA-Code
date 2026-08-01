package binarysearch;

public class SearchInRotatedBinarySearch {
    static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        int target =4;

        //First let's find the least element in the array then the left element would be pivot element
        //Then this small element would be the rotation count
        System.out.println("Rotated binary search count is "+pivotSearch(arr));
        int pivot = pivotSearch(arr)-1;
        System.out.println("the pivot element is "+pivot);
        if(pivot==-1)
        {
            System.out.println("Index of the target element is "+binarySearch(arr,target,0, arr.length-1));
        }
        else {
          int index=   binarySearch(arr, target, 0, pivot);
            System.out.println("index of the target element found in left side "+index);
          if(index==-1)
          {
              System.out.println("index of the element found in the right side "+binarySearch(arr,target,pivotSearch(arr),arr.length-1));
          }


        }


    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = false;
        if(arr[start] < arr[end])
        {
            isAsc = true;
        }
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }

            if(isAsc)
            {
                if(arr[mid] < target)
                {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else {
                if(arr[mid] > target)
                {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    private static int pivotSearch(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start + (end-start)/2;
            /*Check which side is shorted if mid-element is less than the end then left side would be
            * sorted array exists since it has to be decreased and mid can be the possible answer since it is lesser
            * */
            if(arr[mid]< arr[end])
            {
                end = mid;
            }
            else {
                start = mid+1;
            }

        }
        return start;
    }
}

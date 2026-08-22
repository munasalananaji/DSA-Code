package recursion;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {2,5,13,16,55,90};
        int target =55;
        int result = searchTarget(arr, target, 0, arr.length-1);
        System.out.println("The element index is "+result);
    }

    private static int searchTarget(int[] arr, int target, int start, int end) {

        if(start > end)
        {
            return -1;
        }
        int  mid = start + (end-start)/2;
        if(target == arr[mid])
        {
            return mid;
        }
        if(target < arr[mid])
        {
            return searchTarget(arr, target , start, mid-1);
        }
       return searchTarget(arr, target, mid+1, end);
    }


}

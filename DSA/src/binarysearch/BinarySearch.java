package binarysearch;
/*This code is to identify first what type of sort of  array (desc/asec) then apply the binary search
* and get the target element for notes refer kunal notes
* simply this code is order agnostic code*/
public class BinarySearch {

   public static void main(String[] args) {

        int[] arr = {98,95,56,43,23,18,12,8,5,4,2};
        int target = 5;
        System.out.println("index of the target element from an array is "+binarySearch(arr, target));

    }

    public static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

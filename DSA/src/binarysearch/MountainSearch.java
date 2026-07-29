package binarysearch;

public class MountainSearch {
    static void main(String[] args) {
        int[] arr = {2,4,6,8,10,15,16,19,12,11,8,6,5,0};
        System.out.println("Mountain element from the given array is "+mountainSearch(arr));
    }
    private static int mountainSearch(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}

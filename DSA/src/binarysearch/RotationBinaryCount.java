package binarysearch;

public class RotationBinaryCount {
    static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        //First let's find the least element in the array then the left element would be pivot element
        //Then this small element would be the rotation count
        System.out.println("Rotated binary search count is "+binarySearch(arr));
    }

    private static int binarySearch(int[] arr) {

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

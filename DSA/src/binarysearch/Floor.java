package binarysearch;
/*floor is vice versa of ceiling get the target index or index of the num <= target ( amoong this return the smallest one)*/
public class Floor {

   public static void main(String[] args) {
       int[] arr = {2,5,8,12,14,16,17,21,28,30};
       int target = 15;
       System.out.println("floor num for the target element is "+floorNum(arr, target));
    }

    private static int floorNum(int[] arr, int target) {

        //if the target num is greater than the greatest num in the array
        if(target < arr[0]) return -1;

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
            else return end;

        }
        //when loop breaker end will be less than the target and that end is mid - 1 which is exactly
        //smaller among the smaller than target num
        return end;
    }
}

package recursionWithArrays;

public class RotatedSortedArrayUsingBinaryRecursion {
    static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        int pivot = checkPivot(arr, 0, arr.length-1);
        System.out.println("The pivot element is "+ (pivot-1));
        //Now I got the two rotated sorted using the pivot element
        int target = 0;
        int targetIndex=0;
        if(pivot ==-1)
        {
            System.out.println("Pivot is -1");
            targetIndex =  findTargetElement(arr,target, 0, arr.length-1);
        }
        else {
          //Search in left side first
            System.out.println("Check on left ");
             targetIndex =  findTargetElement(arr,target, 0, pivot-1);
            if(targetIndex == -1)
            {
                System.out.println("check on right");
                targetIndex = findTargetElement(arr,target, pivot, arr.length-1);
            }
        }

        System.out.println("The target element from the array is "+targetIndex);
    }

    private static int findTargetElement(int[] arr, int target, int start, int end) {
        boolean isAsc = false;
        if(arr[start]<arr[end])
        {
            isAsc = true;
        }
        if(start>end)
        {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]== target)
        {
            return mid;
        } else
        {
            if(isAsc)
            {

                    if(target> arr[mid])
                    {
                        start = mid+1;
                    }
                    else {
                        end = mid-1;
                    }

            }
            else {
                if(target< arr[mid])
                {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }

        return findTargetElement(arr, target, start, end);


    }

    private static int checkPivot(int[] arr, int start, int end) {

        if(arr[start] <arr[end])
        {
            return -1;
        }
        if(start==end) return end;
        int mid = start + (end -start)/2;
        if(arr[mid]> arr[end])
        {
            start = mid+1;
        }
        else {
            end = mid;
        }

        return checkPivot(arr, start, end);

    }
}

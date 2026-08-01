package ownapproach;

public class SearchInMountain {
    static void main(String[] args) {
        int[] mountainArr  = {2,4,6,9,10,12,13,16,17,21,18,9,6,5,4,3,1};
        int target = 5;
        System.out.println("The mountain element is "+mountainArr[findMountain(mountainArr)]);
        int end = findMountain(mountainArr);
        if(binarySearch(mountainArr, 0,end,target)!=-1)
        {
            System.out.println("Index of the target element is "+binarySearch(mountainArr, 0,end,target));
        }
        else {
            System.out.println("Index of the target element is  else "+binarySearch(mountainArr, end+1,mountainArr.length-1,target));
        }


    }

    public static int binarySearch(int[] arr, int start , int end, int target)
    {
        boolean isAsc = true;
        if(arr[start]>arr[end])
        {
            isAsc = false;
        }
        while(start<=end)
        {

            int mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(arr[mid] > target)
                {
                    end = mid-1;
                } else  {
                    start = mid+1;

                }
            }
            else {
                if(arr[mid] < target)
                {
                    end = mid-1;
                } else {
                    start = mid+1;

                }
            }


        }
        return -1;

    }


    public static int findMountain(int[] arr)
    {
        int start =0;
        int end = arr.length;
        while(start<end)
        {
            int mid = start + (end -start)/2;
            if(arr[mid]> arr[mid+1])
            {
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return  start;
    }
}

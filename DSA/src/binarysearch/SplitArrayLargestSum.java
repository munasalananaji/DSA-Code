package binarysearch;

public class SplitArrayLargestSum {

    static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k =2;
        System.out.println("The largest min sun of subarray for 2 pieces is "+ largestMinSumArray(nums,k));
    }

    private static int largestMinSumArray(int[] nums, int k) {
        int start =0 ;
        int end = 0;

        for(int n : nums)
        {
            start = Math.max(start, n);// Largest element of these 2
            end +=n;
        }
        while(start < end)
        {

            int mid = start + (end-start)/2;
            int pieces =1;
            int sum =0;
            for(int n : nums) {

                sum = sum+n;
                if(sum > mid)
                {
                    pieces++;
                    //Whenever it exceeds the mid-element then make sum = n to start new sub array SUM
                    sum = n;
                }

            }
            if(pieces == k)
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

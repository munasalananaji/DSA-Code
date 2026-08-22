package cyclicsortalgorithm;
// https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class SetMismatch {
    static void main(String[] args) {
        int[] arr = {2,1,2,4};
       int[] result =  setMismatch(arr);
        System.out.println("The mismatch element in an array is "+Arrays.toString(result));
    }

    private static int[] setMismatch(int[] nums) {

        int i =0;
        while(i< nums.length)
        {
            if(nums[i]== i+1  || nums[i] == nums[nums[i]-1])
            {
                i++;
            }
            else {
                swap(nums, i, nums[i]-1);
            }
        }
//        System.out.println("The array is "+ Arrays.toString(arr));
        for(int j = 0; j< nums.length; j++)
        {
            if(nums[j]!= j+1)
            {
                return new int[]{nums[j], j+1};
            }
        }
        return new int[]{-1,-1};
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

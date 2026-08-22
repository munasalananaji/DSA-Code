package cyclicsortalgorithm;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
      int duplicate =   findDuplicates(arr);
        System.out.println("duplicate is "+duplicate);
    }

    private static int findDuplicates(int[] nums) {
        int i =0;
        List<Integer> list = new ArrayList<>();
        while(i< nums.length)
        {
            if(nums[i]== i+1)
            {
                i++;
            }
            else {
                if(nums[i] == nums[nums[i]-1]) return nums[i];
                swap(nums, i, nums[i]-1);
            }
        }

       return -1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

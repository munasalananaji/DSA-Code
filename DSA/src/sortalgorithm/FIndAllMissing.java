package sortalgorithm;

import java.util.ArrayList;
import java.util.List;

public class FIndAllMissing {
    static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        findAllMissings(arr);
        System.out.println("done");
    }

    private static List<Integer> findAllMissings(int[] nums) {

        int i =0;
        while(i< nums.length)
        {
            if(nums[i]== i+1 || nums[i] > nums.length || nums[i]== nums[nums[i]-1] )
            {
                i++;
            }
            else {
                swap(nums, i, nums[i]-1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != j + 1) {
               list.add(j+1);
            }
        }
        return  list;

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

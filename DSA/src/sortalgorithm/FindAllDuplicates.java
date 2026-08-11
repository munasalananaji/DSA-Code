package sortalgorithm;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        List<Integer> duplicate = findDuplicates(arr);
        System.out.println("duplicate is " + duplicate);
    }

    private static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums.length) {
            if (nums[i] == i + 1 || nums[i] == nums[nums[i] - 1]) {
                i++;
            } else {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1) list.add(nums[index]);
        }
        return list;
    }

        private static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }


}


package sortalgorithm;

//https://leetcode.com/problems/first-missing-positive/
public class MissingPositive {
    static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        int result = findMissingPositive(arr);
        System.out.println("The missing positive num from the array is "+result);
    }

    private static int findMissingPositive(int[] nums) {
        int i =0;
        while(i< nums.length)
        {

            if(nums[i]>0 && nums[i] < nums.length && nums[i]!= nums[nums[i]-1])
            {
                swap(nums, i, nums[i]-1);
            }
            else i++;
        }
//        System.out.println("The arrays is "+ Arrays.toString(arr));

        for(int j = 0; j< nums.length; j++)
        {
            if(nums[j] != j+1)
            {
                return j+1;
            }
        }

        return  -1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

package bitwiseoperators;
// Find the non-repeating number from an array
public class FindNonRepeatedNum {
    static void main(String[] args) {
        int[] arr = {3,5,8,10,3,5,8,5};
        int nonRepeatedNum = findNonRepeatedNum(arr);
        System.out.println("The non repeating character is "+nonRepeatedNum);
    }

    private static int findNonRepeatedNum(int[] arr) {
        int res = 0;
       for(int i =0; i<arr.length;i++)
       {

           res = res ^ arr[i];

       }
       return res;
    }
}

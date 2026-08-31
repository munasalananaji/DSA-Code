package recursionWithArrays;

public class CheckArraySorted {
    static void main(String[] args) {
        int[] arr = {2,5,7,12,17,28,31,34,36,41};
        boolean result =  arraySorted(arr, 0);
        System.out.println("Is array sorted "+result );
    }

    private static boolean arraySorted(int[] arr, int i) {
        if(i==arr.length-1)
        {
            return true;
        }

        return arr[i] < arr[i+1] && arraySorted(arr, i+1);
    }
}

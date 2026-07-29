package binarysearch;

public class SmallestLetter {

    static void main(String[] args) {

        char[] arr = {'a','c','d','e','f','g','l','o','x'};

        char target = 'o';
        System.out.println("Printing the nextGreatestLetter is "+ nextGreatestLetter(arr, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target > letters[mid]) {
                start = mid +1;
            }
            else if (target == letters[mid])
            {
                start = mid+1;
            }
            else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }

}

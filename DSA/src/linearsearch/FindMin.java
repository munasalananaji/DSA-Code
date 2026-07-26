package linearsearch;

public class FindMin {

    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));
    }

    static int min(int[] arr)
    {
        int min = arr[0];

        for (int elements : arr) {
            if (min > elements) {
                min = elements;
            }
        }
       return min;
    }

}

package linearsearch;

public class MaxWealth {

    static void main() {
        int arr[][] = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {

        int result = Integer.MIN_VALUE;
        for(int[] acc : accounts )
        {
            int sum =0;
            for(int bal : acc)
            {
                sum = sum+bal;
            }
            if(sum>result)
            {
                result = sum;
            }
        }
        return result;

    }
}

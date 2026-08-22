package bitwiseoperators;

import java.util.Arrays;

//Asked in google flip an image -->reverse each nubers in a row and flip the numbers
public class FlipImage {
    static void main(String[] args) {
        int[][] image = {{1,1,0},{0,1,0},{0,0,1}};
        for(int[] row :  image)
        {
            for(int i =0 ; i< (row.length-1)/2; i++)
            {
                int temp = row[i]^1 ;
                row[i] = row[row.length-i-1]^1;
                row[row.length-i-1] = temp;

            }
        }
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }

    }
}

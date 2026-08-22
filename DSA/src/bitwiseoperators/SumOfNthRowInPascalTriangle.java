package bitwiseoperators;

public class SumOfNthRowInPascalTriangle {
    static void main(String[] args) {
        //Find the sum of numbers at row number six
        int n =7;
        //We know sum of numbers in a row for pascal triangle is 2*n-1
        //So the represent in binary - Since at every position it is the ration of 2
        int res = (1<<(n-1));
        System.out.println("The sum of numbers at the row no 6 is "+res);

    }
}

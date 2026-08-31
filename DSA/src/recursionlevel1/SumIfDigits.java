package recursionlevel1;
//Find sum of the digits in a number
public class SumIfDigits {
    static void main(String[] args) {
        int n = 1342;
       int res = sumOfDigits(n);
        System.out.println("The sum of the digits is "+res);
    }

    private static int sumOfDigits(int n) {
        if(n==0)
        {
            return n;
        }
//        System.out.println("Print "+ n%10);
//        System.out.println("Print n/10 "+n/10);

        return n%10 + sumOfDigits(n/10);

    }
}

package recursionlevel1;

//Same logic since you have done the reverse number
public class Pallindrome {
    static void main(String[] args) {
        boolean res = ispallindrome(12321);
        System.out.println("Is the give number pallindrome "+res);
    }

    private static boolean ispallindrome(int n) {
        if(n==rev(n))
        {
            return true;
        }
        return  false;
    }

    private static int rev(int n) {

        int noOfDigits = (int)Math.log10(n)+1;
        return helper(n, noOfDigits);
    }

    private static int helper(int n, int noOfDigits) {

        if(n==0)
        {
            return n;
        }

        return n%10 * (int)Math.pow(10, noOfDigits-1) + helper(n/10, noOfDigits-1);

    }
}

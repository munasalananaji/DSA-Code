package bitwiseoperators;

public class FindNoOfDigits {
    static void main(String[] args) {
        int n = 3456;
        System.out.println("The binary form of the num is "+Integer.toBinaryString(n));
       int digits =  bruteforce(3456);
        System.out.println("Using brute force approach "+digits);

        //Using the formula see the notes for details on formula
        int resUsingFormula = formula(n);
        System.out.println("Using the formula "+resUsingFormula);
    }

    private static int formula(int n) {

        //for learning sake I am printing the no of digits in base 10 also
        int baseTen = (int) (Math.log(n)/Math.log(10))+1;
        System.out.println("It would print 4 since in base 10 there are 'four' digits "+baseTen);

        //Formula to find the no of digits in a number in binary
        return (int) (Math.log(n)/Math.log(2))+1;
    }

    private static int bruteforce(int n) {
        int count=0;
        while(n>0)
        {
            n = n>>1;

            count++;
        }
        return count;
    }
}

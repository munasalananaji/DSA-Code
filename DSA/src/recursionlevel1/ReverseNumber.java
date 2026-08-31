package recursionlevel1;

public class ReverseNumber {
    static void main(String[] args) {
        int n = 18240;
        reverseNumWay1(n);
        System.out.println(sum);
//        Second way to do is
//        int secondWay = 1391120;
//      int result =  way2(secondWay);
//        System.out.println("The second way to find reverse a number using recursion is "+result);


    }

    private static int way2(int n) {
        if(n%10==n)
        {
            return n;
        }
        int noOfDigits = (int) Math.log10(n)+1;
        System.out.println("No of digits are  "+noOfDigits);

        return n%10*(int)Math.pow(10, noOfDigits-1) + way2(n/10);
    }

    static int sum =0;
    private static void reverseNumWay1(int n) {
       if(n==0)
       {
           return;
       }
       int rem = n%10;
       sum = sum*10+rem;
       reverseNumWay1(n/10);
    }
}

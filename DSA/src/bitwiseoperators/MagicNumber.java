package bitwiseoperators;
//Asked in Amazon interview
public class MagicNumber {
    static void main(String[] args) {
        int n = 6;
        //Find the magic number at 6
        int ans =0;
        int base =5;
        while(n>0)
        {
            //The below line gives you the last binary number from the n
            int last = n&1;
            //Change the n by moving teh digit
            n= n>>1;
            ans = ans+ last *base;
            base = base*5;

        }
        System.out.println("The resultant magic number is "+ans);
    }
}

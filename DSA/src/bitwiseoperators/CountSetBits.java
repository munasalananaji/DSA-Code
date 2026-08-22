package bitwiseoperators;

//There are three ways to write this code
public class CountSetBits {
    static void main(String[] args) {
        int n =31;
        int count=0;
        System.out.println("The binary form of the number is "+Integer.toBinaryString(n));
//        while(n>0)
//        {
//            if((n&1)==1)
//            {
//                count++;
//            }
//            n = n>>1;
//        }

        //Other two ways are
//        while(n>0)
//        {
//            count++;
//            n = n- (n & (-n));
//        }

        while(n>0)
        {
            count++;
            n = n &(n-1);
        }

        System.out.println("The count of the set bits is "+count);
    }
}

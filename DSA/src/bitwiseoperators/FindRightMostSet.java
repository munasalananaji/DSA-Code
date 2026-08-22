package bitwiseoperators;

import java.net.Inet4Address;

/*To find the right most set
* we use n & -n
* Need to check the -n concept in depth
* negative will store in the format of two components format complement of n plus 1 check in gpt for more in details*/
public class FindRightMostSet {
    static void main(String[] args) {
        int a = 56;
        System.out.println("The binary format of the given number is "+ Integer.toBinaryString(a));
        System.out.println("The first right most set is ");
        int res = a & (-a);
        //-a = ~a+1
//        Note it will print the position element at the right most set
        System.out.println(res);
    }
}

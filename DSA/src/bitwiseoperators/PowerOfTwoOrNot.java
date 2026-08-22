package bitwiseoperators;

public class PowerOfTwoOrNot {
    static void main(String[] args) {
        int n =7;
       boolean res = (n & (n-1))==0;
        System.out.println("The given num is power of 2 "+res);
    }
}

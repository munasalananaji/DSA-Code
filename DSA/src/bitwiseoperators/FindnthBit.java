package bitwiseoperators;
// Find the nth bit from the number
public class FindnthBit {
    static void main(String[] args) {
        int a =56;
        //Find the bit at position 3
        int n =2;
        System.out.println("Then binary form of given number "+Integer.toBinaryString(56));
        System.out.println("The n = "+n+" th bit is " + ((a>>n)&1));

    }
}

package bitwiseoperators;

//Make the kth bit 0 which mean non set
public class ResetNthBit {
    static void main(String[] args) {
        int n =55;
        int k =1;
        //you have to apply the same logic of set bit but only have to complement which is reverse of the numbers
        System.out.println("The binary format of given number is "+Integer.toBinaryString(n));
        System.out.println("After reset nth Number is "+ Integer.toBinaryString (n & ~(1<<k)));
    }
}

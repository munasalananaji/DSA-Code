package bitwiseoperators;
//This is basically if nth bit is 1 then stay it as 1 if 0 then make it one
//Think what can give this combination  1 1 -> 1
//                                      0 1 -> 1
// We have OR
public class SetNthBit {
    static void main(String[] args) {
        int a =90;
        int k =3;
        System.out.println("The binary no of  "+a+" is "+Integer.toBinaryString(a));
        System.out.println("Setting the 2nd positing to  " +  Integer.toBinaryString(a | (1<<k))  );
    }
}

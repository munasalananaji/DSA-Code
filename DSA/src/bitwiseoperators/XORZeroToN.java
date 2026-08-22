package bitwiseoperators;

//case1  will only applicable from 0 to a if it is 3 to a some thing we have to follow case2
public class XORZeroToN {
    static void main(String[] args) {
        int a =10;

        //find the XOR from 0 to 10
        int res = XorZeroToA(a);
        System.out.println("The XOR from o to a is "+res);
        //case2
        //Now find the XOR of 3 to 9 which is m to n
        //If you observer we have learnt that a^a =0 so as we know how to 0 to a first do that then do thea a-1

        int m = 3 ; int n =9;
        //first find 0 to  - This includes 0 to 3 as well
        int zeroToNine = XorZeroToA(n);
        //Now 3 which means 0 to 2
        int zeroToThree = XorZeroToA(m-1);
        //If we do XOR for both we can see 0,1,2,3 are repeating and they beocme xero and by end we left with 3 to 9 XOR's as a answer
        int secondResult = zeroToNine^zeroToThree;
        System.out.println("The result of m to n is "+secondResult);

    }

    private static int XorZeroToA(int a) {
        if(a%4 == 0)
        {
            return a;
        }
        else if(a%4==1)
        {
            return 1;
        }
        else if(a%4==2)
        {
            return a+1;
        }
        //a%4==3
        else {
            return 0;
        }
    }
}

package bitwiseoperators;

public class PowerOfAnyNumber {
    static void main(String[] args) {
        int num = 3;
        int power =6;
        int ans =1;
        while (power>0)
        {
            if((power&1)==1)
            {
                ans = ans*num;
            }
            num *= num;
            power = power>>1;
        }
        System.out.println("The three to the power is six is "+ans);
    }

}

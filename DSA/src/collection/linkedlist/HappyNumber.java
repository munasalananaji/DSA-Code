package collection.linkedlist;

public class HappyNumber {
    static void main(String[] args) {

        int n = 19;
        System.out.println("Is the number is happy number "+ isHappy(n));
    }

    public static boolean isHappy(int n)
    {
        int slow = n;
        int fast = n;
        do
        {
           slow =  findSquare(slow);
           fast = findSquare(findSquare(fast));
        } while (slow!=fast);

        return slow == 1;

    }

    private static int findSquare(int num)
    {
        int ans = 0;
        while(num>0)
        {
            int rem = num%10;
            ans = ans+( rem*rem);
            num = num/10;
        }
        return ans;
    }
}

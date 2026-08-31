package recursionlevel1;
//Leet code
public class CountSteps {
    static void main(String[] args) {
        int n =8;
//        System.out.println(n/2);
        int res = check(n,0);
        System.out.println("The no of steps invloved to make the given num zero using the conditions are "+res);
    }

    private static int check(int n, int count) {
        if(n==0)
        {
            return count;
        }
        if(n%2==0)
        {
           return check(n/2, count+1);
        }
        return check(n-1, count+1);

    }
}

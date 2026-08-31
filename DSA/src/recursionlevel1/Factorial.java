package recursionlevel1;

public class Factorial {
    static void main(String[] args) {
        int n=5;

       int res =  findFactorial(n);
        System.out.println(res);
    }

    private static int findFactorial(int n) {
        if(n==0)
        {
            return  n;
        }

       return n* findFactorial(n-1);

    }
}

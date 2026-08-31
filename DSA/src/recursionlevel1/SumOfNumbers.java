package recursionlevel1;

//Sum of n numbers
public class SumOfNumbers {
    static void main(String[] args) {
        int n =10;
      int  res =  sum(n);
        System.out.println(res);
    }

    private static int sum(int n) {
        if(n<=1)
        {
            return n;
        }
        return  n + sum(n-1);
    }
}

package recursionlevel1;

public class CountZerosInNumber {
    static void main(String[] args) {
        int n = 102000005;
       int result =  fun(n, 0);
        System.out.println(result);
    }


    private static int fun(int n, int count) {
        if(n==0)
        {
            return count;
        }
        if(n%10==0)
        {
          return  fun(n/10, count+1);
        }
        else {
           return fun(n/10, count);
        }
    }
}

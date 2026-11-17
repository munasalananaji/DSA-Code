package collection.stack.interviewQuestions;

import java.util.Arrays;

public class TwoStackGame {

    static  int twoStack(int target, int[] a, int[] b)
    {
        return twoStackRecursion(target, a, b , 0, 0)-1;
    }

    private static int twoStackRecursion(int target, int[] a, int[] b, int sum, int count) {
        if(sum>target)
        {
            return count;
        }

        int ans1 = twoStackRecursion(target, Arrays.copyOfRange(a, 1, a.length), b,a[0]+sum, count+1);
        int ans2 = twoStackRecursion(target, a,Arrays.copyOfRange(b, 1, b.length),b[0]+sum, count+1);
        return Math.max(ans1, ans2);
    }

    static void main(String[] args) {
        int a[] = {4,2,4,6,1};
        int b[] = {2,1,8,5};
       int result =  twoStack(10, a,b);
        System.out.println(result);
    }
}

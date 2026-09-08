package stringrecursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RotateADice {
    static void main(String[] args) {
        int target = 4;
        rotateDice("", 4);
        System.out.println("The count of the permutation and combination is "+rotateDiceCount("", 4));
        System.out.println("The return list is in array is "+rotateDiceArray("", 4));
    }

    private static void rotateDice(String s, int i) {
        if(i==0)
        {
            System.out.println(s);
            return;
        }
        for(int k =1; k<=i ;k++)
        {
            rotateDice(s+k, i-k);
        }

    }

    private static int rotateDiceCount(String s, int i) {
        if(i==0)
        {

            return 1;
        }
        int count =0;
        for(int k =1; k<=i ;k++)
        {
           count = count+ rotateDiceCount(s+k, i-k);
        }
        return count;
    }

    private static ArrayList<String> rotateDiceArray(String s, int i) {
        if(i==0)
        {
        ArrayList<String> list = new ArrayList<>();
        list.add(s);
            return list;
        }
        int count =0;
        ArrayList<String> list = new ArrayList<>();
        for(int k =1; k<=i ;k++)
        {
            list.addAll(rotateDiceArray(s+k, i-k));
        }
        return list;

    }
}

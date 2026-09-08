package stringrecursion.iteration.subsequent;

import java.util.ArrayList;
import java.util.List;

public class SubSequent {
    static void main(String[] args) {
        int[] arr = {1,3,4};
        //So let's first right possible subsequent's from an array is [1] [3] [4] [13] [14] [34] [134]
        List<List<Integer>> lis = subSequent(arr);
        System.out.println("came");
        for(List<Integer> n :lis)
        {
            System.out.println("entered here"+n);
        }
    }

    private static List<List<Integer>> subSequent(int[] arr) {
        //Initially having empty arraylist with size 1
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int n : arr)
        {
            int size = outer.size();
            for(int i =0 ;i<size;i++)
            {
                List<Integer> copy = new ArrayList<>(outer.get(i));
                copy.add(n);
                outer.add(copy);
            }

        }
        return outer;
    }
}

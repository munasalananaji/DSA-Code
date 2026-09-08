package stringrecursion.iteration.subsequent;

import java.util.ArrayList;

public class SubSequentDuplicates {
    static void main(String[] args) {
        int[] arr = {1,2,2};
        ArrayList<ArrayList<Integer>>  list = subSeqDup(arr);
        for(ArrayList<Integer> n : list)
        {
            System.out.println(n);
        }

    }

    private static ArrayList<ArrayList<Integer>> subSeqDup(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i =0 ;i<arr.length ;i++)
        {
            int start =0;
            if(i > 0 && arr[i] == arr[i - 1])
            {
                start = i+1;
            }
            int n = outer.size();
            for(int j =start ; j<n;j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}

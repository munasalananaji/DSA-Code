package stringrecursion;

import java.util.ArrayList;

public class PermutationAndCombination {
    static void main(String[] args) {
        String str = "abc";
        permutation("", str);
      ArrayList<String> result =  permutationArrayList("", str);
        System.out.println("The array list is "+result);
        System.out.println("The count of permutation is "+permutationCount("", str));
    }

    public static ArrayList<String> permutationArrayList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i =0; i<=p.length();i++)
        {
            String left = p.substring(0,i);
            String second = p.substring(i);
          ArrayList<String> all=   permutationArrayList(left+ch+second, up.substring(1));
          list.addAll(all);
        }

        return list;
    }

    private static void permutation(String s, String str) {
        if(str.isEmpty())
        {
            System.out.println(s);
            return;
        }
        char ch = str.charAt(0);
        for(int i =0 ;i<= s.length();i++)
        {
           String first = s.substring(0,i);
           String last = s.substring(i);
           permutation(first+ch+last,str.substring(1) );
        }
    }

    private static int permutationCount(String s, String str) {
        if(str.isEmpty())
        {
            return 1;
        }
        char ch = str.charAt(0);
        int count =0;
        for(int i =0 ;i<= s.length();i++)
        {
            String first = s.substring(0,i);
            String last = s.substring(i);
          count = count +   permutationCount(first+ch+last,str.substring(1));
        }
        return count;
    }
}

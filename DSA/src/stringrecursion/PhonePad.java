package stringrecursion;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    static void main(String[] args) {
        String s = "12";
        phonePadCombinations("", s);
      ArrayList<String> result =   phonePadCombinationsArray("",s);
        System.out.println("The result is "+result);
        System.out.println("The count of the combination is " + phonePadCombinationsCount("", "12"));
    }

    private static void phonePadCombinations(String up, String p) {
        if(p.isEmpty())
        {
            System.out.println(up);
            return;
        }
        int digit = p.charAt(0)-'0';
        for(int i = (digit -1)*3; i< digit *3; i++)
        {
            char ch = (char) ((char) 'a'+i);
            phonePadCombinations(up+ ch, p.substring(1));
        }

    }
    private static ArrayList<String> phonePadCombinationsArray(String up, String p) {
        if(p.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        int digit = p.charAt(0)-'0';
        ArrayList<String> finalL = new ArrayList<>();
        for(int i = (digit -1)*3; i< digit *3; i++)
        {
            char ch = (char) ((char) 'a'+i);
            ArrayList<String> ls   = phonePadCombinationsArray(up+ ch, p.substring(1));
            finalL.addAll(ls);
        }
        return finalL;
    }

    private static int phonePadCombinationsCount(String up, String p) {
        if(p.isEmpty())
        {
            return 1;
        }
        int digit = p.charAt(0)-'0';
      int count =0;
        for(int i = (digit -1)*3; i< digit *3; i++)
        {
            char ch = (char) ((char) 'a'+i);
           count   = count + phonePadCombinationsCount(up+ ch, p.substring(1));

        }
        return count;
    }
}

package stringrecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequentString {
    //Let's do this example for subsequent string of [abc] --> [a] [b] [c] [ab] [cb] [ac] [abc]
    static void main(String[] args) {
        String str = "abc";
        subSeq( "", str);
        ArrayList a = subSeqArrayListArgument("", "abc", new ArrayList<>());
        System.out.println("The array list is "+a);

       ArrayList<String> list =  subSeqArray( "", str);
        System.out.println("The array list inside the body is "+list);
    }

    private static ArrayList<String> subSeqArray(String emp, String str) {
        ArrayList<String> list = new ArrayList<>();
        if(str.isEmpty())
        {
            list.add(emp);
            return list;
        }
        char ch = str.charAt(0);
       ArrayList<String> left = subSeqArray(ch+emp, str.substring(1));
        ArrayList<String> right = subSeqArray(emp, str.substring(1));
        left.addAll(right);
        return left;


    }

    private static void subSeq(String emp,String str) {
        if(str.isEmpty())
        {
            System.out.println(emp);
            return;
        }
        char ch = str.charAt(0);
        subSeq(ch+emp, str.substring(1) );
        subSeq(emp, str.substring(1));
    }

    //Return as ArrayList pass it as argument

    private static ArrayList<String> subSeqArrayListArgument(String emp, String str, ArrayList<String> arr) {
        if(str.isEmpty())
        {
            arr.add(emp);
            return arr;
        }
        char ch = str.charAt(0);
        subSeqArrayListArgument(ch+emp, str.substring(1), arr );
        subSeqArrayListArgument(emp, str.substring(1), arr);
        return arr;
    }

    //ArrayListInside the body

}

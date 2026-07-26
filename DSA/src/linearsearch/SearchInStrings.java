package linearsearch;

import java.util.Arrays;

public class SearchInStrings {

    static void main() {
        String name = "Kunal";
        char target = 'u';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }

    static  boolean search(String name, char target)
    {
        for( char character : name.toCharArray())
        {
            if(target == character)
            {
                return true;
            }
        }
        return false;
    }

    static  int search2(String name, char target)
    {
        for( int i =0;i<name.length();i++)
        {
            if(target == name.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }

}

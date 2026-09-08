package stringrecursion;
//Remove the character a from the given string using recursion
public class RemoveCharacter {
    static void main(String[] args) {
        String s = "bcahdaad";
        String emp ="";
        //First type as usual adding by the
        firstType(s, emp);
        //second type is
        String result = secondType(s);
        System.out.println("The resultant string without the character a "+result);

        //Skip Apple from the below String
        String apple = "abcdafappleklj";
        String result1 = skipApple(apple);
        System.out.println("The resultant string with out apple is "+result1);

    }

    private static String skipApple(String apple) {
        if(apple.isEmpty())
        {
            return "";
        }
        char ch = apple.charAt(0);
        if(apple.startsWith("apple"))
        {
            return skipApple(apple.substring("apple".length()));
        }
        else {
            return ch +skipApple(apple.substring(1));
        }
    }

    private static String secondType(String s) {
        if(s.isEmpty())
        {
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a')
        {
            return secondType(s.substring(1));
        }
        else {
            return ch +secondType(s.substring(1));
        }
    }

    private static void firstType(String s, String emp) {
        if(s.isEmpty())
        {
            System.out.println("The string with the given character 'a' is "+emp);
            return;
        }

        char ch = s.charAt(0);
        if(ch=='a')
        {
            firstType(s.substring(1), emp);
        }
        else {
            emp = emp+ ch;
            firstType(s.substring(1), emp);
        }
    }
}

package stringrecursion;

//Do not confuse we are just adding a another recursion call as same as the first call but
// we are now pring ascii value to string
public class SubSeqWithAscii {
    static void main(String[] args) {
        String str = "abc";
        subSeqAcii("", str);
    }

    private static void subSeqAcii(String s, String str) {
        if(str.isEmpty())
        {
            System.out.println(  s);
            return;
        }
        char ch = str.charAt(0);
        subSeqAcii(s+ch , str.substring(1));
        subSeqAcii(s + (ch+0), str.substring(1));
        subSeqAcii(s, str.substring(1));
    }
}

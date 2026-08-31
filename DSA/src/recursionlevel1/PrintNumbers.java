package recursionlevel1;
//In this code we are printing the numbers from n to 1 and vice versa
public class PrintNumbers {
    static void main(String[] args){
        int n =5;
//        fun(n);
        //Print 1 to  n
//        funRev(n);
        funBoth(n);
    }

    private static void funBoth(int n) {
        if(n<1)
        {
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

    private static void funRev(int n) {
        if(n<1)
        {
            return;
        }
        funRev(n-1);
        System.out.println(n);

    }

    //Print n to 1
    private static void fun(int n) {
        if(n<1)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);

    }
}

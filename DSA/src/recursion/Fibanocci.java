package recursion;
//The function which calls itself and iterate is called Recursion
public class Fibanocci {
    static void main(String[] args) {
        int result  = findBinacci(50);
        System.out.println("The result is "+result);
    }

    private static int findBinacci(int n) {

        if(n<=1)
        {
          return n;
        }

      int res =   findBinacci(n-1)+findBinacci(n-2);

        return res;
    }


}

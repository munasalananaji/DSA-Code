package patterns;

public class Pattern {
    static void main(String[] args) {
        pattern1(5);
    }

    /*
     * *
     * * *
     * * * *
     * * * * * */
    private static void pattern1(int n) {

        for(int i =0; i<n ;i++)
        {
            int row = i;
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     * */
    private static void pattern2(int n) {

        for(int i =0; i<2*n ;i++)
        {
            int row = i;
            int col = row > 5 ? 2*n-i : row;
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */
    private static void pattern3(int n) {

        for(int i =0; i<=2*n ;i++)
        {
            int row = i;
            int col = row > 5 ? 2*n-i : row;
            int spaces = n -col;

            for(int s =0 ;s <=spaces ;s++)
            {
                System.out.print("* ");
            }

            for (int j = 0; j < col; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}

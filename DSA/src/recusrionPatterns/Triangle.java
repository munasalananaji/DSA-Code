package recusrionPatterns;

public class Triangle {
    static void main(String[] args) {
        int n =5;
        triangle(5, 1);
        System.out.println("============================================");
        triangle2(5,1);
    }

    //You are printing before the function storing in stack  - If you print after words the function
    //Then when it's coming back the values will be printed which is non -reversed triangle
    private static void triangle(int r, int c) {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            triangle(r, c+1);
        }
        else {
            System.out.println();
            triangle(r-1, 1);
        }
    }
    private static void triangle2(int r, int c) {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            triangle2(r, c+1);
            System.out.print("*");

        }
        else {
            triangle2(r-1, 1);
            System.out.println();

        }
    }
}

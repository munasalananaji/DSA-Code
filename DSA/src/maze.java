public class maze {
    static void main(String[] args) {
       int count = mazeCount(3,3);
        System.out.println("The count of the ways to reach 3,3 is "+count );
        mazeWays("", 3,3);
    }

    private static int mazeCount(int r, int c) {
        if(r==1 && c ==1)
        {
            return 1;
        }
        int left =0, right =0;
        if(r>1)
        {
            left = mazeCount(r-1,c);
        }
        if(c>1)
        {
            right = mazeCount(r, c-1);
        }
        return left+right;
    }
    private static void mazeWays(String p, int r, int c) {
        if(r==1 && c ==1)
        {
            System.out.println(p);
            return;
        }
        int left =0, right =0;
        if(r>1)
        {
             mazeWays(p+"D",r-1,c);
        }

        if( c>1)
        {
             mazeWays(p+"R",r, c-1);
        }
    }
}

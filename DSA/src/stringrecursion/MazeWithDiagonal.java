package stringrecursion;

public class MazeWithDiagonal {
    static void main(String[] args) {
        mazeDiagonal("",3,3);
    }

    private static void mazeDiagonal(String s, int r, int c) {
        if(r==1 && c==1)
        {
            System.out.println(s);
            return;
        }
        if(r>1 && c>1)
        {
            mazeDiagonal(s+"D", r-1, c-1);
        }
        if(r>1)
        {
            mazeDiagonal(s+"V", r-1,c);
        }

        if(c>1)
        {
            mazeDiagonal(s+"H", r,c-1);
        }
    }
}

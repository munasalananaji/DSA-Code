package stringrecursion.backtracking;

public class Nknights {
    static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        int count = nKnightsProgram(board, 0,0,n);
        System.out.println("The no of ways is "+count);
    }

    private static int nKnightsProgram(boolean[][] board, int r, int c, int target) {
        //Base condition
        //Display 1 when all targets knights are placed
        if(target==0)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        if(r== board.length)
        {
            return 0;
        }

        if(c == board.length)
        {
           return nKnightsProgram(board, r+1, 0,target);

        }

        if(isValid(board,r, c,target))
        {
            //choose
            board[r][c] = true;
            //explore
        count +=    nKnightsProgram(board, r, c+1, target-1);
            //backTrack
            board[r][c] = false;
        }
        count += nKnightsProgram(board, r, c+1, target);
        return count;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr1 : board )
        {
            for(boolean arr2 : arr1)
            {
                if(arr2)
                {
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isValid(boolean[][] board, int r, int c, int target) {
        if(isInRange(board, r-2, c-1))
        {
            if(board[r-2][c-1])
            {
                return false;
            }
        }
        if(isInRange(board, r-2, c+1))
        {
            if(board[r-2][c+1])
            {
                return false;
            }
        }
        if(isInRange(board, r+2, c-1))
        {
            if(board[r+2][c-1])
            {
                return false;
            }
        }
        if(isInRange(board, r+2, c+1))
        {
            if(board[r+2][c+1])
            {
                return false;
            }
        }
        if(isInRange(board, r-1, c-2)) {
            if(board[r-1][c-2]) {
                return false;
            }
        }

        if(isInRange(board, r-1, c+2)) {
            if(board[r-1][c+2]) {
                return false;
            }
        }

        if(isInRange(board, r+1, c-2)) {
            if(board[r+1][c-2]) {
                return false;
            }
        }

        if(isInRange(board, r+1, c+2)) {
            if(board[r+1][c+2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isInRange(boolean[][] board, int r, int c) {
        if(r>=0 && r<board.length && c>=0 && c<board.length)
        {
            return true;
        }
        return false;
    }
}

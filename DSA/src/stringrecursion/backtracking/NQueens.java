package stringrecursion.backtracking;

public class NQueens {
    static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
       int count = nQueensProgram(board, 0);
        System.out.println("The no of ways is "+count);
    }

    private static int nQueensProgram(boolean[][] board, int row) {
        if(row == board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        for(int col =0; col <board[0].length; col++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = true;
              count +=  nQueensProgram(board,row+1);
                board[row][col] = false;

            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical
        for(int i =0 ; i<row ;i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        //check Left Diagonal min of row and col
        int maxLeft = Math.min(row, col);

        for(int i =1 ; i<=maxLeft; i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }

        //check right diagonal
        int maxRight = Math.min(row, board.length-col-1);
        for(int i =1 ; i<=maxRight; i++)
        {
            if(board[row-i][col+i])
            {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr1 : board )
        {
            for(boolean arr2 : arr1)
            {
                if(arr2)
                {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


}

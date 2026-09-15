package backtracking;

public class SudukoSolver {
    static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        if(solver(board))
        {
            display(board);
        }
        else {
            System.out.println("Failed to solve the sudoko");
        }
    }

    private static void display(char[][] board) {
        for(char[] r : board)
        {
            for(char c : r)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    /*Let's solve this code step by step
     * step 1 : run the loop over the 9*9 rows and columns
     * step 2: check the empty places
     * step 3 : run the characters from 1 to 9 and check for valid position or not*/
    private static boolean solver(char[][] board) {
        for (int r = 0; r < 9; r++) {

            for(int c =0;c<9; c++)
            {
                if(board[r][c]=='.')
                {
                    for(char num = '1'; num<='9'; num++)
                    {
                        if(isValid(board, r,c,num))
                        {
                            //choose
                            board[r][c] = num;
                            //explore
                            if(solver(board))
                            {
                                return true;
                            }
                            //backTrack
                            board[r][c] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int r, int c, int num) {

        //Check in same row
        for(int col =0;col<9;col++)
        {
            if(board[r][col] ==num)
            {
                return false;
            }
        }

        //Check for all columns
        for(int row=0; row<9;row++)
        {
            if(board[row][c] ==num)
            {
                return false;
            }
        }

        //Check with in the 3*3 box
        int startRow = (r/3 )*3;
        int startcol = (c/3 )*3;
        for(int row =startRow ;row<startRow+3 ; row++)
        {
            for (int col = startcol; col < startcol+3; col++) {
                if(board[row][col]==num)
                {
                    return false;
                }

            }
        }
        return true;
    }
}

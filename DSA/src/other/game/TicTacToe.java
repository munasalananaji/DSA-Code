package other.game;

import java.util.Scanner;

public class TicTacToe {

    static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i =0 ;i<board.length ;i++)
        {
            for(int j=0; j<board.length;j++)
            {
                board[i][j]=' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        while(!gameOver)
        {
            printBoard(board);
            System.out.println("Player "+ player+" enter: ");
            System.out.print("enter row : ");
            int row = sc.nextInt();
            System.out.print("enter row : ");
            int col = sc.nextInt();
            if(board[row][col] ==' ')
            {
                board[row][col] = player;
                gameOver = haveWon(board,player);
                if (gameOver)
                {
                    if(player =='X')
                    {
                        System.out.println("Nanaji won the match");
                    }
                    else {
                        System.out.println("Manikanta won the match");
                    }

                }
                if(player=='X')
                {
                    player = 'O';
                }
                else {
                    player ='X';
                }
            }
            else {
                System.out.println("U are not allowed to enter here");
            }

        }

    }

    private static boolean haveWon(char[][] board, char player) {

        for(int row = 0; row<board.length; row++)
        {
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player)
            {
                return true;
            }

        }

        for(int col = 0; col <board.length; col++)
        {
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player)
            {
                return true;
            }

        }

        if(board[0][0]==player && board[1][1]==player  && board[2][2]==player )
        {
            return true;
        }

        if(board[0][2]==player && board[1][1]==player  && board[2][0]==player )
        {
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for(int i =0 ;i<board.length ;i++)
        {
            for(int j=0; j<board.length;j++)
            {
                System.out.print(board[i][j]+" | " );
            }
            System.out.println();
        }
    }
}

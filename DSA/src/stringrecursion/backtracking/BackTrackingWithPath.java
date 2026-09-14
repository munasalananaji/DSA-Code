package stringrecursion.backtracking;

import java.util.Arrays;

public class BackTrackingWithPath {
    static void main(String[] args) {
        boolean maze1 [][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println("The length of the maze is "+maze1.length);
        int[][] path = new int[maze1.length][maze1[0].length];
       mazeWithPath(maze1, "", 0,0,path, 1);
    }

    private static void mazeWithPath(boolean[][] maze1, String p, int r, int c, int[][] path, int step) {

        if(r==maze1.length-1 && c == maze1[0].length-1)
        {
            path[r][c] = step;
            for(int[] a : path)
            {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p+"\n");
            return;
        }
        if(!maze1[r][c]) return;
        maze1[r][c] = false;
        path[r][c] = step;
        if(r<maze1.length-1)
        {
            mazeWithPath(maze1, p+"D",r+1,c,path, step+1);
        }
        if(c<maze1.length-1)
        {
            mazeWithPath(maze1, p+"R",r,c+1,path, step+1);
        }
        if(r>0)
        {
            mazeWithPath(maze1, p+"U",r-1,c,path, step+1);
        }
        if(c>0)
        {
            mazeWithPath(maze1, p+"U",r,c-1,path, step+1);
        }
        maze1[r][c] = true;
        path[r][c] = 0;
    }
}

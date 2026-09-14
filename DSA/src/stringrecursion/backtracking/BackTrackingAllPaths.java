package stringrecursion.backtracking;
//This code is about back tracking - Which means once you already visited the path then you should not
//go back in the same path - So this code logic will apply
//Now the back tracking once after you done with the recursion call you have to set back the path to reset
//Since for other recursion calls that path shouldn't be a restriction for it.
public class BackTrackingAllPaths {
    static void main(String[] args) {
        boolean maze1 [][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println("The length of the maze is "+maze1.length);
        mazwWithAllPaths(maze1,"", 0, 0);
    }

    private static void mazwWithAllPaths(boolean[][] maze,String p, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println("The valid path is "+p);
            return;
        }
        if(!maze[r][c])
        {
           return;
        }
        maze[r][c] = false;
        if(r<maze.length-1)
        {
            mazwWithAllPaths(maze,p+"D",r+1, c);
        }
        if(c<maze.length-1)
        {
            mazwWithAllPaths(maze,p+"R",r, c+1);
        }
        if(r>0)
        {
            mazwWithAllPaths(maze,p+"U",r-1, c);
        }
        if(c>0)
        {
            mazwWithAllPaths(maze,p+"L",r, c-1);
        }
/*This is the end of the recursion call so setting up the path or cell to true again to enable
* next recursion call to use the path while coming in different direction*/
        maze[r][c] = true;

    }
}

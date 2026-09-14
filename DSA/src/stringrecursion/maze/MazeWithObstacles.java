package stringrecursion.maze;

public class MazeWithObstacles {
    static void main(String[] args) {
        boolean[][] withObstacle =  {
                {true , true , true},
                {true, false, true},
                {true, true, true}

        };

        mazeWithObstacles(withObstacle,"", 0, 0);
    }

    private static void mazeWithObstacles(boolean[][] withObstacle,String p, int r, int c) {
        if(r == withObstacle.length-1  && c == withObstacle[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!withObstacle[r][c])
        {
            return;
        }
        if(r<withObstacle.length-1)
        {
            mazeWithObstacles(withObstacle,p+"D", r+1, c);
        }
        if(c<withObstacle[0].length-1)
        {
            mazeWithObstacles(withObstacle,p+"R", r, c+1);
        }
    }
}

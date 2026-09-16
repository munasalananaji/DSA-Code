package non_string.programs;

public class TransposeMatrix {
	//Transpose of a matrix
	
	public static void main(String[] args)
	{
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
        
        int r = m.length;
        int c= m[0].length;
        int[][] t = new int[c][r];
        
        for(int i =0; i<r;i++)
        {
        	for(int j =0;j<c;j++)
        	{
        		t[j][i] = m[i][j] ;
        	}
        }
        
        for(int i =0;i<t.length;i++)
        {
        	for(int j =0;j<t[0].length;j++)
        	{
        		System.out.print(t[i][j]+" ");
        		
        	}
        	System.out.println();
        }

	}

}

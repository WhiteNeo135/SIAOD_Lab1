import java.util.Random;

public class Generator
{
    public static int[][] matrix(int m, int n, int min, int max)
    {
        int[][] matrix= new int[m][n];
        double rand=0;
        Random random=new Random();

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                rand=Math.random()*((max-min)+1)+min;
                matrix[i][j]=(int) rand;
            }
        }
        return matrix;
    }
}

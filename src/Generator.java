import java.util.Random;

public class Generator
{
    public static int[][] matrix(int m, int n, int min, int max)
    {
        int[][] matrix= new int[m][n];

        Random random=new Random();

        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                matrix[i][j]=random.nextInt();
            }
        }
        return matrix;
    }
}

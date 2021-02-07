import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[][] matrix = Generator.matrix(0, 0, 0, 0);
        String ans = "";
        int n = 50;
        int m = 50;
        int min_limit = -10;
        int max_limit = 10;
        boolean correct = false;
        Scanner in = new Scanner(System.in);

        System.out.println("Будете менять значения по умолчанию (+/-)");
        while (!correct)
        {
            ans = in.nextLine();
            if (!ans.equals("+") && !ans.equals("-"))
            {
                System.out.println("допустимые символы- + и -, дайте корректный ответ");
            } else
            {
                correct = true;
            }
        }
        if (ans.equals("+"))
        {
            System.out.println("Введите кол-во столбцов матрицы");
            m = in.nextInt();
            System.out.println("Введите кол-во строк матрицы");
            n = in.nextInt();
            System.out.println("Введите минимальное возможное значение");
            min_limit = in.nextInt();
            System.out.println("Введите минимальное возможное значение");
            max_limit = in.nextInt();
        }
        matrix=Generator.matrix(m,n,min_limit,max_limit);

        for (int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

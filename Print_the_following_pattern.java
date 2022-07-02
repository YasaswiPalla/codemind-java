import java.util.Scanner;

 class Pattern
{
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
 for (int i = 1; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c,fa;
        c=sc.nextFloat();
        fa=((c*9)/5)+32;
        System.out.printf("%.2f",fa);
    }
}
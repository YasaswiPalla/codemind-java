import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        int n;
        final double PI=3.14;
        double area;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        area=(PI*n*n);
        System.out.printf("%.2f",area);
    }
}
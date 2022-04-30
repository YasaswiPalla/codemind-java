import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
         float a,b;
        double  c;
        Scanner sc=new Scanner(System.in);
         a=sc.nextFloat();
         b=sc.nextFloat();
         c=(a+b)/2;
         System.out.printf("%.4f",c);
         
    }
}
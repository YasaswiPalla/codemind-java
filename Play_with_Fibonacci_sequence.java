import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
 {
        int a,b,c,n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=0;
        b=1;
        System.out.print(a+" "+b);
        for(i=1;i<=n-2;i++)
        {
            c=a+b;
            System.out.print(" ");
            System.out.print(c);
            a=b;
            b=c;
        }
    }
}

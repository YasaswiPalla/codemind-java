import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int t,i;
    t=sc.nextInt();
    for(i=0;i<t;i++)
    {
        int a,b,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println(sum);
    }
    }
}
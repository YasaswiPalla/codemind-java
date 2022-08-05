import java.util.Scanner;
class series
{
    public static void main(String[] args)
    {
        float n,i,f,sum=0;
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=1/i;
            sum=sum+f;
        }
        System.out.printf("%.2f",sum);
    }
}
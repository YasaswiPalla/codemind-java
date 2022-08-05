import java.util.Scanner;
class Range
{
    public int isPrime(int x)
    {
        if(x==1)
        {
            return 0;
        }
        int i,fact=0;
        for(i=2;i<=(int)Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                fact++;
            }
        }
        if(fact==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        int m,n,r,i,sum=0;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=m;i<=n;i++)
        {
            Range p=new Range();
            r=p.isPrime(i);
            if(r==1)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
import java.util.Scanner;
class des
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,f=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(x[i]<=x[i+1])
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
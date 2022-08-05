import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n],i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%k==0)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
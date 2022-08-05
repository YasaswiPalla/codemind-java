import java.util.Scanner;
class div
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,r,k,i,count=0;
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                count++;
            }
        }
        System.out.printf("%d",count);
    }
}
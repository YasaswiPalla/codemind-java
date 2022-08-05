import java.util.Scanner;
class prosub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,pro=1,sum=0,sub;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        sub=pro-sum;
        System.out.printf("%d",sub);
    }
}
import java.util.Scanner;
class large
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,r,large=1,i;
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
        r=n%10;
        if(r>large)
        {
        large=r;
        }
        n=n/10;
    }
    System.out.println(large);
    }
}
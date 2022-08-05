import java.util.Scanner;
class mix
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,r,o_count=0,e_count=0;
    n=sc.nextInt();
    while(n>0)
    {
    r=n%10;
    if(r%2==0)
    {
        e_count++;
    }
    else
    {
        o_count++;
    }
    n=n/10;
    }
    if(o_count==0)
    {
         System.out.println("Even");
    }
    else if(e_count==0)
    {
         System.out.println("Odd");
    }
    else
    {
        System.out.println("Mixed");
    }
}
}
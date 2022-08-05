import java.util.Scanner;
class equal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x==0&&y%2==0)
        {
            System.out.printf("YES");
        }
        else if(x==0&&y%2!=0)
        {
            System.out.printf("NO");
        }
        else if((x+2*y)%2==0)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}
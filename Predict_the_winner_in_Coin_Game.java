import java.util.Scanner;
class win
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    if(a%2==0||b%2==0)
    {
    System.out.println("Player 1");
    }
    else
    {
    System.out.printf("Player 2");
    }
}
}
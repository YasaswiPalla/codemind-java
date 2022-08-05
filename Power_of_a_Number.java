import java.util.Scanner;
class power
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x,y,z,d=0,p=1;
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    while(y!=0)
    {
      p=p*x;
      --y;
    }
    d=p%z;
    System.out.printf("%d",d);
  }
}
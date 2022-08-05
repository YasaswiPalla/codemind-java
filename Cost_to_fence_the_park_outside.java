import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,c;
        int area,cost;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        area=((l+(2*w))*(b+(2*w)))-(l*b);
        cost=area*c;
        System.out.printf("%d",cost);
    }
}
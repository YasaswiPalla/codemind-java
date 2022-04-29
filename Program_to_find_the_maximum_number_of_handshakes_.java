import java.util.Scanner;
class handshakes
{
    public static void main(String args[])
    {
        int n,hs;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        hs=(n*(n-1))/2;
        System.out.println(hs);
    }
}
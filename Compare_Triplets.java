import java.util.Scanner;
class triplets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A=0,B=0;
        int i,a[],b[];
        a=new int[3];
        b=new int[3];
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
         for(i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
         for(i=0;i<3;i++)
        {
           if(a[i]>b[i])
           {
               A++;
           }
           else if(b[i]>a[i])
           {
               B++;
           }
        }
       System.out.printf("%d %d",A,B);
    }
}
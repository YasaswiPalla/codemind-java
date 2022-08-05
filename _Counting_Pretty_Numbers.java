import java.util.Scanner;
class pretty
{
    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,i,j,c=0;
        n=sc.nextInt();
        int x[][]=new int[n][2];
        for(i=0;i<n;i++)
        {
            for(j=0;j<2;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=x[i][0];j<=x[i][1];j++)
            {
                r=j%10;
                if(r==2||r==3||r==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
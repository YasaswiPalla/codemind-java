import java.util.Scanner;
class odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
	int n,a[],i;
	int o=0;
	n=sc.nextInt();
	a=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
    }
	for(i=0;i<n;i++)
	{
    if(a[i]%2!=0)
    {
    	o=i;
	} 
    }
    System.out.printf("%d",o);
    }
}
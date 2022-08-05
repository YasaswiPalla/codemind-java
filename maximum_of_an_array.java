import java.util.Scanner;
class max
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int n,max;
	n=sc.nextInt();
	int a[],i;
	a=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
    }
    max=a[0];
    	for(i=0;i<n;i++)
	{
	    if(a[i]>max)
	    {
    	max=a[i];
	    }
	} 
    System.out.printf("%d",max);
}
}
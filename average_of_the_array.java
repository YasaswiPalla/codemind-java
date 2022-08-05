import java.util.Scanner;
class up
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int n;
	float sum=0;
	n=sc.nextInt();
	int a[],i;
	a=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
    }
    	for(i=0;i<n;i++)
	{
    	sum=sum+a[i];
	} 
    System.out.printf("%.2f",sum/n);
}
}
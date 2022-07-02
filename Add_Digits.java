import java.util.Scanner;
class sum
{
public static void main(String args[])
{
int num,sum=0,r;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num>0)
{
r=num%10;
sum=sum+r;
num=num/10;
if(num==0&&sum>9)
{
num=sum;
sum=0;
}
}
System.out.println(sum);
}
}


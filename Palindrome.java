import java.io.*;
class Palindrome
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num,sum=0,rem,m;
num=Integer.parseInt(br.readLine());
m=num;
while(num>0)
{
rem=num%10;
sum=sum*10+rem;
num=num/10;
}
if(sum==m)
System.out.println("True");
else
System.out.println("False");
}
}
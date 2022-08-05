import java.util.Scanner;

class AbundantNumber
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();   
        int sum = 0;
        for(int i = 1; i<num; i++)
            if(num%i==0)
                sum+=i;
        
        if(sum>num)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
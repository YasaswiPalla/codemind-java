import java.util.Scanner;
class Bill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String cusid,name;
        int units;
        float amt=0;
        cusid=sc.nextLine();
        name=sc.nextLine();
        units=sc.nextInt();
        if(units<200)
        {
            amt=units*1.2f;
        }
        else if(units>=200 && units<400)
        {
            amt=units*1.5f;
        }
        else if(units>=400 && units<600)
        {
            amt=units*1.8f;
        }
        else if(units>=600)
        {
            amt=units*2.00f;
        }
        if(amt>400)
        {
            amt=amt+0.15f*amt;
        }
        else
        {
            amt=amt+100;
        }
        System.out.printf("%.2f",amt);
    }
}
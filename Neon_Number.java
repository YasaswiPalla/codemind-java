import java.util.Scanner;
 class Neon {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num;
         num =sc.nextInt();
        int sum =0, sqr = num*num;
        while(sqr>0){
            sum += sqr%10;   
            sqr = sqr/10;    
        }
 
        if(sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}
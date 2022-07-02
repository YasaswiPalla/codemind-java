import java.util.Scanner;
 class p {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
  int row_size,out,in;
   row_size=cs.nextInt();
   for(out=row_size;out>=1;out--)
    {
     for(in=row_size;in>=1;in--)
      System.out.print(in+" ");

          System.out.println();
    }
  cs.close();
 }
}


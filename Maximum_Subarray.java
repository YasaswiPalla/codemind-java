import java.util.Scanner;
 
class MaxSubarraySum1
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[ N ];
        for (int i = 0; i < N; i++)
            arr[i] = scan.nextInt();
        System.out.println( max_sum(arr));
    }
    public static int max_sum(int[] arr)
    {
        int N = arr.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
        {
            int sum = 0;
            for (int j = i; j < N; j++)
            {
                sum += arr[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;    
    }
}
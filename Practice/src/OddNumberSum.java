import java.util.Random;
import java.util.Scanner;



public class OddNumberSum {

    
    public static int OddNumber(int[]arr, int index)
    {
        int sum = 0;
        for(int i = 0; i < index; i++)
        {
            if(arr[i] % 2 != 0)
            {
                System.out.println("Odd number: "+arr[i]);
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int OddIndex(int[] arr, int index)
    {
        int sum = 0;
        for(int i = 0 ; i < index; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println("Odd index: "+arr[i]);
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n;
        
        System.out.println("Input n: ");
        n = scan.nextInt();
        while(n <= 0)
        {
            System.out.println("Wrong number!\nTry again: ");
            n = scan.nextInt();
        }
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++)
        {
            arr[i] = rand.nextInt(50);
        }
        int sum = OddNumber(arr, n);
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("The sum of all odd numbers in the array is: "+sum);

        int IndexSum = OddIndex(arr, n);

        System.out.println("The sum of all odd index numbers in the array is: "+IndexSum);
        scan.close();
    }
}

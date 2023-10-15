import java.util.Scanner;

public class ArrayProduct {


    public static int ProductNum(int[] arr, int n)
    {
        int sum = 1 ;
        //for(int i = 0 ; i < n; i++)
        //    {
        //        System.out.print("Number "+(i+1)+" " +arr[i]);
        //        
        //    }
        for(int i = 0 ; i < n; i++)
        {
            sum *= arr[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input how much numbers you want: ");
        int number;
        number = scan.nextInt();
        if(number <= 0)
        {
            System.out.println("The sum is 0");
        }
        else
        {
            int[] arr = new int[number];
            
            for(int i = 0 ; i < number; i++)
            {
                System.out.print("Input number "+(i+1)+" :");
                arr[i] = scan.nextInt();
            }
            int sum = ProductNum(arr, number);
            System.out.println("The product is : "+sum);
        }
        scan.close();
    }

}

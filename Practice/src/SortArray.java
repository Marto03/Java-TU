import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static int[] BubbleSort(int[] arr,int n)
    {
        for(int i = 0 ; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[j] < arr[i])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }
    public static int[] InsertionSort(int[] arr, int n)
    {
        for(int i = 0; i < n; i ++)
        {
            int j = i-1;
            int temp = arr[i];
            //while(temp < arr[j] && j >= 0) 
            while (j >= 0 && temp < arr[j]) //order of conditions!!!!!!!
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much numbers: ");
        int n;
        n = scan.nextInt();
        if(n <= 0)
        {
            System.out.println("Invalid number!");
        }
        else
        {
            int arr[] = new int[n];
            for(int i = 0 ; i < n; i ++)
            {
                System.out.print("Input number "+(i+1)+" :");
                arr[i] = scan.nextInt();
            }
            int[] sorted = BubbleSort(arr,n);
            System.out.println("BubbleSorted array is : "+Arrays.toString(sorted));

            int[] sorted1 = InsertionSort(arr,n);
            System.out.println("InsertionSorted array is : "+Arrays.toString(sorted1));
        }

        scan.close();
        

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {

    public static int[] CreateArray() // =============== Working
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Input how much numbers you want: ");
        n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++)
        {
            System.out.println("Input number "+i+" :");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    //              ======================================================

    public static int[] DuplicateNums(int[] arr) // ============ Working
    {
        //int len = arr.length;
        //for(int i = 0 ; i < len; i++)
        //{
        //    for(int j = i+1; j < len; j++)
        //    {
        //        if(arr[i] == arr[j])
        //        {
        //            arr[j] = arr[len-1];
        //            len--;
        //            
        //        }
        //    }
        //}
        //return  arr;

    int len = arr.length;

    for (int i = 0; i < len; i++)
    {
        for (int j = i + 1; j < len; j++)  // Start j from i + 1
        {
            if (arr[i] == arr[j])
            {
                // Shift elements to the left to overwrite the duplicate
                for (int k = j; k < len - 1; k++)
                {
                    arr[k] = arr[k + 1];
                }
                len--;  // Reduce the array length
                j--;    // Decrement j to recheck the current index
            }
        }
    }

    int[] newArr = new int[len];  // Create a new array with the updated length
    //System.arraycopy(arr, 0, newArr, 0, len);

    Arrays.sort(arr); //--------> Sorting elements in the array, must import java.util.Arrays!


    // Copy the elements to the new array
    for (int i = 0; i < len; i++)
    {
        newArr[i] = arr[i];
    }

    return newArr;
}

//               =================================================================

    public static int[] BubbleSortArr(int[] arr)
    {
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0; j<arr.length-i-1; j++)
            {
                if(arr[j+1] < arr[j])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //           ==========================================================================

    public static int[] InsertionSortArr(int[] arr)
    {
        for(int i = 0 ; i< arr.length; i++) // Could work with int i = 1 as well !
        {
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 &&temp < arr[j]) // Must be checked J first !
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

//              =================================================================

    public static int FindNumber(int[] arr) // ============ Working
    {
        int n;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Check for a specific number to see if it's in the array: ");
        n = scan.nextInt();
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] == n)
            {
                System.out.println("The number "+n+ " is found in the array at place: "+i);
                flag = true;
            }
        }
        if(flag == false)
        {
            return 0;
        }
        return n;
    }

    //                  =============================================================================

    public static int[] RemoveInts(int[] arr, int num)
    {
        //for(int i = 0 ; i<arr.length; i++) ==============================  Almost working!
        //{
        //    for(int j = 0; j < arr.length-1;j++)
        //    {
        //        if(arr[j] == num)
        //        {
        //            int temp = arr[i];
        //            arr[i] = arr[j];
        //            arr[j] = temp;
        //            break;
        //        }
        //    }    
        //}
        //int[] arr2 = new int[arr.length];
        int count = 0 ;
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] == num)
            {
                count++;
            }
            else
            {
                arr[i-count] = arr[i];
            }
        }
        int len = arr.length-count;
        System.out.println(count+" count");
        while(len < arr.length)
        {
            arr[len] = 0;
            len++;
        }
        
        return arr;
    }

    //                  ========================================================================
    
    public static void main(String[] args)
    {
        int[] arr = CreateArray();
        
        //System.out.println(FindNumber(arr)); ============ Working

        //int arrs[] = DuplicateNums(arr);


        //System.out.println(DuplicateNums(arr));

        //for(int i = 0 ; i < arrs.length; i ++)
        //{
        //    System.out.print(arrs[i]+"\t");
        //}
        
        /*ArrayAverage aver = new ArrayAverage();
        System.out.println(aver.Average()); ============Thats one way!*/
        
        //==========================================================================

        //System.out.println(ArrayAverage.Aver(arr)); =========Thats another way!

        //for(int i = 0 ; i < arr.length; i++)
        //{
        //    System.out.println(arr[i]+ " ");
        //}

        // ===========================================

        //int arr1[] = RemoveInts(arr, 10);
        //for(int i = 0 ; i< arr1.length; i++)
        //{
        //    System.out.print(arr1[i]+ " ");
        //}

        //BubbleSortArr(arr);
        InsertionSortArr(arr);

        for(int i = 0 ; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // ================================ Test

        // float sum = ArrayAverage.Aver(arr);
        // System.out.println(sum);
        
        // ======================================

        
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}

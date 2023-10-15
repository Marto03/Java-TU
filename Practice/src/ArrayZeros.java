public class ArrayZeros {
    public static void main(String[] args)
    {
        int arr[] = ArrayEx.CreateArray();
        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = i+1 ; j < arr.length; j++)
            {
                if(arr[i] == 0) // If i want zeros to be placed in the left , arr[j] == 0 ! Or sort 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < arr.length; i ++)
        {
            System.out.print(arr[i] + "\t");
        }
    }
}

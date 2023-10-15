public class ArrayAverage {

    //int NumSum()
    //{
    //    int[] arr = ArrayEx.CreateArray();
    //    int sum = 0;
    //    for(int i = 0 ; i< arr.length; i++)
    //    {
    //        sum += arr[i];
    //    }
    //    return sum;
    //}

    public static float Aver(int[] arr)
    {
        float sum = 0;
        arr = ArrayEx.CreateArray();
        for(int i = 0 ; i< arr.length; i++)
        {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    
}


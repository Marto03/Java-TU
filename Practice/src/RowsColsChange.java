import java.util.Scanner;

public class RowsColsChange {

    private static Scanner scan;

    public static int[][] Create2dArray(int r, int c)
    {
        scan = new Scanner(System.in);
        int arr[][] = new int[r][c];
        System.out.print("Input numbers: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0 ; j < c; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public static int[][] ChangeRowsCols(int[][] arr, int r , int c)
    {
        int Arr[][] = new int[c][r];
        for(int i = 0 ; i < r; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                Arr[j][i] = arr[i][j];
            }
        }

        //for(int i = 0 ; i < r; i++)
        //{
        //    for(int j = 0 ; j < c ; j++)
        //    {
        //        System.out.println(Arr[i][j]);
        //    }
        //    System.out.println(" ");
        //}
        return Arr;
    }
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        System.out.println("How much rows: ");
        int r = scan.nextInt();

        System.out.println("How much cols: ");
        int c = scan.nextInt();

        int[][] arr = Create2dArray(r, c);

        // ==========================================================
        //System.out.print("Input numbers: ");
        //for(int i = 0; i < r; i++)
        //{
        //    for(int j = 0 ; j < c; j++)
        //    {
        //        arr[i][j] = scan.nextInt();
        //    }
        //}
        // ===========================================================

        for(int i = 0; i < r; i++)
        {
            for(int j = 0 ; j < c; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
        int[][] transposedArr = ChangeRowsCols(arr, r, c);
        for(int i = 0 ; i < c; i++)
        {
            for(int j = 0 ; j < r ; j++)
            {
                System.out.print(transposedArr[i][j]+ " ");
            }
            System.out.println(" ");
        }
        scan.close();
    }
}

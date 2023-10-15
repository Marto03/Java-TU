import java.util.Scanner;

public class Patterns {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int rows,cols;
        char symbol;
        System.out.println("Input rows: ");
        rows = scan.nextInt();

        System.out.println("Input cols: ");
        cols = scan.nextInt();

        System.out.println("Input symbol: ");
        symbol = scan.next().charAt(0);

        /*if(rows == 0 || cols == 0)
        {
            System.out.println("Invalid number!");
        }
        else
        {
            for(int i = 0; i <= rows;i++)
            {
                for(int j = 0; j < cols - i; j++)
                {
                    System.out.print(symbol);
                }
                System.out.println();
            }
            for(int k = 0; k <= rows;k++)
            {
                for(int x = 0; x <= k; x++)
                {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        }

        for(int i = rows; i > 0; i--)
        {
            for(int j = rows; j >= i;j--)
            {
                
                System.out.print(i); // if print(j) --> 3 /n 3 2 /n 3 2 1 
            }
            System.out.print("\n");
        }*/
        int k = 1;
        for(int i = 0 ; i < rows; i++)
        {
            for(int j = 0 ; j <= i; j++)
            {
                System.out.print(k);
                System.out.print(" ");
                k++;
            }
            System.out.println();
        }

        scan.close();
    }
}


/*for(int i = 0; i <= rows;i++)
            {
                for(int j = 0; j < cols - i; j++)
                {
                    System.out.print(symbol);
                }
                System.out.println();
            } */


/*for(int i = 0; i <= rows;i++)
{
    for(int j = 0; j <= i; j++)
    {
        System.out.print(symbol);
    }
    System.out.println();
} */
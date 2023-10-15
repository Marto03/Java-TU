import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        int n1 = 0, n2 = 1;
        int temp = 0;
        System.out.println("Input Nth number: ");
        n = scan.nextInt();
        
        for(int i = 0; i<n;i++)
        {
            System.out.print(n1+ " ");
            temp = n1+n2;
            n1 = n2;
            n2 = temp;
        }

        scan.close();
    }
}

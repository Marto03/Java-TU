import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Input n: ");
        n = scanner.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("The number: "+n+" is even");
        }
        else
        {
            System.out.println("The number: "+n+" is odd");
        }
        scanner.close();
    }
}

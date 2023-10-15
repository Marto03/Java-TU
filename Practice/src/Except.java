import java.util.InputMismatchException;
import java.util.Scanner;


public class Except {

    //public static void exception()
    //{
    //    throw new InputMismatchException("Invalid number!");
    //}
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Input number: ");
        

        try {
            n = scan.nextInt();
            Exceptions.trynumber(n); // from another file!!!
            System.out.println("Your number : "+ n);

        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scan.close();
    }
}

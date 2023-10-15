import java.util.Scanner;

public class Exceptions {

    public static void trynumber(int n)
    {
        try {
            checkEvenNumber(n);
            System.out.println(n+ " is even.");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void checkEvenNumber(int number)
    {
        if(number % 2 != 0)
        {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Input number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        trynumber(n);
        scan.close();

    }
}

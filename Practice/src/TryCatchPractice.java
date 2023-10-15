import java.util.Scanner;

public class TryCatchPractice {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Input an INTEGER number between 1 and 100(Exclusive): ");
            int n;
            n = scan.nextInt();
            if(n <= 0 || n >= 100)
            {
                scan.close();
                throw new RangeException("Number must be in range of 1 and 100(Exclusive)");
            }
        } catch (RangeException e) {
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}

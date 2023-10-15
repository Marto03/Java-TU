import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Input n: ");
        try {
            n = scan.nextInt();
            int x = 0, r = 0;
            int temp = n;
            while(n > 0)
            {
                r = n %10;
                x = (x*10)+r;
                n/=10;
                
            }
            if(temp == x)
                {
                    System.out.println("The number is palindrome!");
                }
            else
            {
                System.out.println("The number is not palindrome!");
            }
                
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
        


        scan.close();
    }
}

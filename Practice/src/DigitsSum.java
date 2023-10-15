import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n,s=0;
        System.out.println("Input number between 0 and 1000: ");
        n = scan.nextInt();
        int x = n;
        if(n < 0 || n > 1000)
        {
            System.out.println("Wrong number!!!");
        }
        else
        {
            while(n > 0)
            {
                //int n1 = n;
                s += n%10;
                n/=10;
            } 
        System.out.println("Sum of all digits in the number "+x+" is: "+s);
        }
        scan.close();
        
    }
}

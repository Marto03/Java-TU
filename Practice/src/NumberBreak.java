import java.util.Scanner;

public class NumberBreak {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Input integer: ");
        num = scan.nextInt();
        int remainder = 0,n = 0;
        while(num != 0)
        {
            
            remainder = num % 10;
            n = n * 10 + remainder;
            num /=10;
            //System.out.println(remainder+"\t");
            //System.out.println(n+"\t");
        }
        int number = 0;
        while(n > 0)
        {
            number = n % 10;
            n /=10;
            System.out.print(number+"\t");
        }
        //System.out.println(n+"\t");
        scan.close();
    }
}

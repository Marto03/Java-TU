import java.util.Scanner;

public class MetersConverter {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        double n, x = 0;
        char option;
        System.out.println("Input number: ");
        n = scan.nextDouble();
        scan.nextLine();
        System.out.println("Input to what to convert to : (I) or (M): ");
        option = scan.next().charAt(0);
        char opt = Character.toUpperCase(option);
        if(opt == 'M')
        {
            x = n * 0.0254;
        }
        else if(opt == 'I')
        {
            x = n / 0.0254;
        }

        System.out.println(n+" converted to "+opt+" = "+x);

        scan.close();

    }
}

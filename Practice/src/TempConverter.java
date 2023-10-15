import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float x;
        float n = 0 ;
        char option;
        System.out.println("Input to what to convert (C) or (F): ");
        option = scan.next().charAt(0);
        char up = Character.toUpperCase(option);
        System.out.println("Input temperature: ");
        x = scan.nextFloat();

        if(up == 'C' /*|| option == 'c'*/)
        {
            n = ((5*(x - 32)) / 9);
        }
        else if(up == 'F' /*|| option == 'f'*/)
        {
            n = ((9*x + (32 * 5)) / 5);
        }
        else
        {
            System.out.println("No such Temperature scale!");
        }

        System.out.println("Converted temperature to "+up+" is "+n);
        scan.close();
    }
}

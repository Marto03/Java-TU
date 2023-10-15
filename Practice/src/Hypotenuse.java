import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        float x = scanner.nextFloat();

        System.out.println("Input y: ");
        float y = scanner.nextFloat();

        double z = Math.sqrt((x*x)+(y*y));
        System.out.println("Hypotenuse is : "+z);
        scanner.close();
    }
}

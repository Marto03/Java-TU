import java.util.Scanner;

public class BMI {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double weight,height;
        System.out.println("Input weight: ");
        weight = scan.nextDouble();

        while(weight <= 0)
        {
            System.out.println("Invalid weight!");
            System.out.println("Try again: ");
            weight = scan.nextDouble();
        }

        System.out.println("Input height: ");
        height = scan.nextDouble();
        while(height <= 0)
        {
            System.out.println("Invalid height!");
            System.out.println("Try again: ");
            height = scan.nextDouble();
        }
        height /=100;
        height = Math.pow(height, 2);
        double bmi = weight/height;
        //System.out.println("Your BMI is : "+bmi);
        System.out.printf("Your BMI is %.2f", bmi);
        scan.close();
    }
}

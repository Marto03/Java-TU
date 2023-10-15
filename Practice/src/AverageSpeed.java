import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float hours,mins,secs,distance;

        System.out.println("Input distance in meters: ");
        distance = scan.nextFloat();

        System.out.println("Input hours: ");
        hours = scan.nextFloat();

        System.out.println("Input mins: ");
        mins = scan.nextFloat();

        System.out.println("Input seconds: ");
        secs = scan.nextFloat();

        float time = (distance *3600)/((hours * 3600 + mins * 60 + secs)* 1000);
        float meters = distance / (hours * 3600 + mins * 60 + secs);

        System.out.println("Your speed in km/h is : "+time);
        System.out.println("Your speed in m/s is : "+meters);
        scan.close();
    }
}

import java.util.Scanner;

public class ConvertMins {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int mins ,hour = 0,days = 0, years = 0;
        int hours = 0;
        System.out.println("Input mins: ");
        mins = scan.nextInt();
        int min = mins;
        while(mins > 60)
        {
            if(days >= 365)
            {
                years++;
                days = 0;
            }
            else if(hour >= 24)
            {
                days++;
                hour = 0;
            }
            else if(mins >= 60)
            {
                hour++;
                hours++;
                mins -=60;
                if(hours == 24)
                {
                    hours = 0;
                }
            }
        }
        System.out.println(min+" mins --> "+years+" years , "+days+" days and "+hours+" hours");
        scan.close();
    }
}

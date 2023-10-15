import java.util.Scanner;

public class StringLength {

    public static int Stringlenght(String arr)
    {
        return arr.length();
    }
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input String: ");
        String str;
        str = scan.nextLine();
        int len = Stringlenght(str);
        System.out.println("The lenght of "+str+" is: "+len);
        scan.close();
    }
}

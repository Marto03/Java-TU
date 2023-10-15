import java.util.Scanner;
 // ===================================== Working
public class StringReverse {

    public static StringBuilder reversed(String arr)
    {
        StringBuilder Rev = new StringBuilder();
        Rev.append(arr);
        Rev.reverse();
        return Rev;
    }

    /* ====================================== Easier and faster way!
    public static String reverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
}
 */

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String arr;
        System.out.println("Input String: ");
        arr = scan.nextLine();
        StringBuilder reversed = reversed(arr);

        /*
        reversed.append(arr);
        reversed.reverse();
        */

        System.out.println(reversed);
        scan.close();

    }
}

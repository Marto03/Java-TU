import java.util.Arrays;
import java.util.Scanner;

/* =============================== Not working ================================= */
public class ReverseString {

    public static String[] reverse(String arr)
    {
        String[] reversed = new String[arr.length()];
        for(int i = arr.length() -1 ; i >= 0; i--)
        {
            reversed[i] = arr;
        }

        return reversed;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.println("Input string: ");
        str = scan.nextLine();
        String[] arr = reverse(str);
        System.out.println("Original string: "+str);
        System.out.println("Reversed string is : "+Arrays.toString(arr));
        /* ====================== This is WORKING ====================
        StringBuilder reversed = new StringBuilder();
         
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reversed.append(str.substring(i, i + 1));
        }
        
        System.out.println("Reversed string final is : "+reversed);
        */
        scan.close();
    }
}

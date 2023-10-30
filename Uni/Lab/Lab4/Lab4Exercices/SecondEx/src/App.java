import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        EventLog e = new EventLog(null);

        try {
            e.AddEvent(scan);
            e.Delete("Random");
            e.Print();
        } catch (InvalidElement | LengthException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

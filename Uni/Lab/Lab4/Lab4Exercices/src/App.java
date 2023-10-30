import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            Books b = new Books(20, 10, "Avtor", "Title");

            TVs t = new TVs(30, 10, "Produc", "Model", 220);
            b.checkPromo(scan);
            t.checkPromo(scan);
            t.electricity(scan);
        } catch (PriceException | PowerException e) {
            System.err.println(e.getMessage());
        }
    }
}

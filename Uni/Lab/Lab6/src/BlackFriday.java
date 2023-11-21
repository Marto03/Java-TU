import java.io.IOException;

public class BlackFriday {
    public static Electronics[] electronics = new Electronics[5];
    public static Book[] books = new Book[5];
    public static Product[] P = new Product[5];

    public static void processSales() {
        ProductLoader p = new ProductLoader();
        try {
            P = p.inputDataFromArray();
        } catch (IOException e) {
            System.err.println("Error");
        }
        for (int i = 0; i < P.length; i++) {
            for (Product x : P) {
                if (x instanceof Electronics) {
                    electronics[i] = (Electronics) x;
                } else if (x instanceof Book) {
                    books[i] = (Book) x;
                }

            }

        }

    }

    public static void main(String[] args) {
        processSales();
    }
}

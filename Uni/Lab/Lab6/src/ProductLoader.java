import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductLoader implements IImportData {

    public Product[] inputDataFromArray() throws IOException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("salesproducts.txt"))) {
            Product[] products1 = null;
            try {
                Object o = in.readObject();
                products1 = (Product[]) o;
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("IOException ProductLoader");
            }

            return products1;
        }
    }

    @Override
    public void writeToFile(Product[] Parr) throws IOException { // Трябва да е void
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("salesproducts.txt"))) {
            out.writeObject(Parr);
            out.flush();
            out.close();
        } catch (IOException e) {
            System.err.println("Serialization problem: " + e.getMessage());
        }
        // Това се прави на отделен метод от тип Object[] или тип Product[]
        // try (ObjectInputStream in = new ObjectInputStream(new
        // FileInputStream("salesproducts.txt"))) {
        // Object o = in.readObject();
        // Product[] products1 = (Product[]) o;
        // for (Product P : products1) {
        // if (P instanceof Electronics) {
        // return BlackFriday.electronics;
        // } else if (P instanceof Book) {
        // return BlackFriday.books;
        // }
        // }
        // // String x = o.toString();
        // // if ((o instanceof Product) && x.startsWith("1")) {

        // // System.out.println("The object is Electronics");
        // // Electronics restored = (Electronics) o;
        // // restored.print();
        // // return BlackFriday.electronics;
        // // }
        // // if ((o instanceof Product) && x.startsWith("2")) {
        // // System.out.println("The object is Book");
        // // Book restored = (Book) o;
        // // restored.print();
        // // }
        // in.close();
        // } catch (IOException e) {
        // System.out.println("Deserialization problem: " + e.getMessage());
        // throw new IOException();
        // } catch (ClassNotFoundException e) {
        // System.out.println("Unknown object: " + e.getMessage());
        // }

        throw new IOException("Unimplemented method 'importDataFromFile'");
    }

    // public int getNumberOfRows() throws IOException {
    // try (ObjectInputStream in = new ObjectInputStream(new
    // FileInputStream("salesproducts.txt"))) {
    // Object o = in.readObject();
    // if (!(o instanceof Product)) {
    // System.out.println("The object is not a product!");
    // } else {
    // }
    // }

    // }
}

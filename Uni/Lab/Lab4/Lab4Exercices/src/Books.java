import java.util.Scanner;

public class Books extends Goods {

    public Books(int price, int number, String a, String t) throws PriceException {
        super(price, number);
        this.Author = a;
        this.title = t;
    }

    private String Author;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public double checkPromo(Scanner scan) throws PriceException {
        System.out.println("Input price");
        float x = scan.nextFloat();
        if (x <= 0) {
            throw new PriceException();
        } else {
            return x - 15 / 100;
        }

    }

}

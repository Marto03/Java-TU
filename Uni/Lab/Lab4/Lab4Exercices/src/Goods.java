import java.util.Scanner;

public abstract class Goods {
    public Goods(int price, int number) throws PriceException {
        setPrice(price);
        this.number = number;
    }

    private int price;
    private int number;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws PriceException {
        if (price <= 0) {
            throw new PriceException();
        } else {
            this.price = price;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract double checkPromo(Scanner scan) throws PriceException;

}

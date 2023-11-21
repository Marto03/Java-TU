public class Book extends Product {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String title;

    public Book(String inventoryNumber, double price, int quantity, Provider provider, String author, String title) {
        super(inventoryNumber, price, quantity, provider);
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPromotionalPrice() {
        return (getPrice() - 50 / 100);
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        throw new UnsupportedOperationException("Unimplemented method 'sellProduct'");
    }

    public void print() {
        System.out.println("Book: " + "num: " + getInventoryNumber() + "author: " +
                getAuthor() + " title: " + getTitle());
    }

}

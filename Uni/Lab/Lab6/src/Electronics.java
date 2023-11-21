public class Electronics extends Product {
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private String model;

    public Electronics(String inventoryNumber, double price, int quantity, Provider provider, String manufacturer,
            String model) {
        super(inventoryNumber, price, quantity, provider);
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getPromotionalPrice() {
        return (getPrice() - 10 / 100);
    }

    @Override
    public boolean sellProduct(int piece) throws NoMoreProductsException {
        throw new UnsupportedOperationException("Unimplemented method 'sellProduct'");
    }

    public void print() {
        System.out.println("Electronics: " + "num: " + getInventoryNumber() + " price: " +
                getPrice() + "....");
    }

}

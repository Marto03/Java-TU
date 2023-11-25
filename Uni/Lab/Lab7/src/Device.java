import java.io.Serializable;

public class Device implements Serializable {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private float price;

    public Device(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "Brand: " + getBrand() + " Model: " + getModel() + " Price: " + getPrice();
    }

    public Device inputDevice(String br, String m, float pr) {
        Device d = new Device(brand, model, price);
        return d;
    }
}

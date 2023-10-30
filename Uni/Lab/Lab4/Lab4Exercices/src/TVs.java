import java.util.Scanner;

public class TVs extends Goods implements IElectricalAppliance {

    public TVs(int price, int number, String p, String m, float pr) throws PriceException {
        super(price, number);
        this.producer = p;
        this.model = m;
        this.power = pr;
    }

    private String producer;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private float power;

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
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

    @Override
    public void electricity(Scanner scan) throws PowerException {
        System.out.println("Input electricity");
        float x = scan.nextFloat();
        if (x <= 0) {
            throw new PowerException();
        } else {
            setPower(x);
        }
    }

}

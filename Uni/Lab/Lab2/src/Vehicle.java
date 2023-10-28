public abstract class Vehicle {
    private int maxSpeed;
    private String Model;
    private float Price;
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public void setMaxSpeed(int max)
    {
        this.maxSpeed = max;
    }
    public String getModel()
    {
        return Model;
    }
    public void setModel(String model)
    {
        this.Model = model;
    }
    public float getPrice()
    {
        return this.Price;
    }
    public void setPrice(float price)
    {
        this.Price = price;
    }

    public Vehicle(int speed, String m, float price)
    {
        this.maxSpeed = speed;
        this.Model = m;
        this.Price = price;
    }

    public abstract double checkPromo(double p);
}

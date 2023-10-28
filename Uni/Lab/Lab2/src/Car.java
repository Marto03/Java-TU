public class Car extends Vehicle implements IIsLandVehicle {
    private int Power;
    public int getPower()
    {
        return this.Power;
    }
    public void setPower(int p)
    {
        this.Power = p;
    }
    @Override
    public double checkPromo(double x) {
        x -= 20/100;
        return x;
    }
    public Car(int speed , String m, float p, int z)
    {
        super(speed, m, p);
        this.Power = z;
    }
    public void enterLand()
    {
        System.out.println("Island");
    }
}

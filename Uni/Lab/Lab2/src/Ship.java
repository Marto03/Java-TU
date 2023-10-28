public class Ship extends Vehicle implements IIsSeaVessel {
    private double deadWeight;
    public double getDeadWeight()
    {
        return this.deadWeight;
    }
    public void setDeadWeight(double d)
    {
        this.deadWeight = d;
    }

    public Ship(int speed , String m, float p, double d)
    {
        super(speed, m, p);
        this.deadWeight = d;
    }

    @Override
    public void enterSea() {
        System.out.println("Entered sea");
    }

    @Override
    public double checkPromo(double p) {
        p -= 0.3/100;
        return p;
    }
    
}

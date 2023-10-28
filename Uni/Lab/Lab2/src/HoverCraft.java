public class HoverCraft extends Vehicle implements IIsLandVehicle, IIsSeaVessel {

    private int passengers;

    public int getPassengers()
    {
        return this.passengers;
    }
    public void setPassengers(int p)
    {
        this.passengers = p;
    }

    public HoverCraft(int speed , String m, float p, int z)
    {
        super(speed, m, p);
        this.passengers = z;
    }
    @Override
    public double checkPromo(double p) {
        p -= 3/100;
        return p;
    }

    @Override
    public void enterLand() {
        System.out.println("Entered land");
        
    }

    @Override
    public void enterSea() {
        System.out.println("Entered sea");
    }

    
}

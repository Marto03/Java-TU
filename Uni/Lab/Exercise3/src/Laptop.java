public class Laptop extends Mobile {
    private int Ram;
    private int HDD;
    public int getRam()
    {
        return this.Ram;
    }
    public void setRam(int n)
    {
        this.Ram = n;
    }

    public int getHDD()
    {
        return this.HDD;
    }
    public void setHDD(int n)
    {
        this.HDD = n;
    }
    
    public Laptop(int r, int hdd)
    {
        super();
        this.Ram = r;
        this.HDD = hdd;
    }

    public boolean isBetter(Laptop l)
    {
        if(getHDD() < l.getHDD() && getRam() < l.getRam())
        {
            return false;
        }
        return true;
    }

    public String ToString()
    {
        return ("Laptop: " + this.getElect() + " " + this.getModel()
        + " " + this.getHDD() + " " + this.getRam());
    }
}

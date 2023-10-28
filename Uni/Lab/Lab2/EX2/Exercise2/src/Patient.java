public abstract class Patient {
    private String name;
    private String address;
    private int EGN;

    public Patient(String x, String add, int _egn)
    {
        this.name = x;
        this.address = add;
        this.EGN = _egn;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String n)
    {
        this.name = n;
    }
    public String getAddress()
    {
        return this.address;
    }
    public void setAddress(String a)
    {
        this.address = a;
    }
    public int getEGN()
    {
        return this.EGN;
    }
    public void setEGN(int e)
    {
        this.EGN = e;
    }

    public void PrintAll()
    {
        System.out.println(getName() + " " + getAddress() + " " + getEGN());
    }

    public void SetAll(String n, String a, int e)
    {
        this.name = n;
        this.address = a;
        this.EGN = e;
    }

    public abstract void cure(String name, int n);

}
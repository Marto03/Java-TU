public class Mobile {
    private float Electricity;
    private String model;
    
    public float getElect()
    {
        return this.Electricity;
    }
    public void setElect(float ele)
    {
        this.Electricity = ele;
    }

    public String getModel()
    {
        return this.model;
    }
    public void setModel(String model1)
    {
        this.model = model1;
    }

    public void turnOnDevice()
    {
        System.out.println("Device" + this.getModel() + " Is turned on");
    }

    public void turnOffDevice()
    {
        System.out.println("Device" + this.getModel() + " Is turned off");
    }

    public Mobile()
    {
        this.Electricity = getElect();
        this.model = getModel();
    }
}

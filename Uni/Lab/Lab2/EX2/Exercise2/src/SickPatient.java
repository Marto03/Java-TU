public class SickPatient extends Patient {
    private String Epicriza;
    private String Status;
    private int Day;
    public String getEp()
    {
        return this.Epicriza;
    }
    public void setEp(String e)
    {
        this.Epicriza = e;
    }
    public String getStatus()
    {
        return this.Status;
    }
    public void setStatus(String s)
    {
        this.Status = s;
    }
    public int getDay()
    {
        return this.Day;
    }
    public void setDay(int d)
    {
        this.Day = d;
    }

    public SickPatient(String x, String add, int _egn, String ep, String medicine)
    {
        super(x, add, _egn);

    }
    @Override
    public void cure(String name, int number) {
        System.out.println("The medicine is taken");        
    }
    
}

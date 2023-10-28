public class Student extends People {
    private double fnum;
    private float PikD;
    private float TeD;
    private float PpeD;

    public double getFnum()
    {
        return this.fnum;
    }
    public void setFnum(long num)
    {
        this.fnum = num;
    }

    public float getPikD()
    {
        return this.PikD;
    }
    public void setPikD(float pik)
    {
        this.PikD = pik;
    }

    public float getTed()
    {
        return this.TeD;
    }
    public void setTed(float te)
    {
        this.TeD = te;
    }

    public float getPpeD()
    {
        return this.PpeD;
    }
    public void setPpeD(float ppe)
    {
        this.PpeD = ppe;
    }

    public Student(double x, float PIK, float TED, float PPE)
    {
        super();
        this.fnum = x;
        this.PikD = PIK;
        this.TeD = TED;
        this.PpeD = PPE;
    }

    public void changeDegPik(float num)
    {
        this.PikD = num;
    }

    
    public void changeDegTed(float num)
    {
        this.TeD = num;
    }

    
    public void changeDegPpe(float num)
    {
        this.PpeD = num;
    }

}

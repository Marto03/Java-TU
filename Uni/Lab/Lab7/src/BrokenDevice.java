public class BrokenDevice extends Device {
    public BrokenDevice(String brand, String model, float price, String symptoms, int days) {
        super(brand, model, price);
        setSymptoms(symptoms);
        setDays(days);
    }

    private String symptoms;

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    private int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public BrokenDevice inputDevice(String br, String m, float pr, String symptoms, int days) {
        BrokenDevice bd = new BrokenDevice(br, m, pr, symptoms, days);
        return bd;
    }

    public String toString() {
        return "Brand: " + getBrand() + " Model: " + getModel() + " Price: " + getPrice()
                + " Symptoms:" + getSymptoms() + " Days for repair: " + getDays();
    }

    public int compareTo(BrokenDevice o2) {
        return 0;
    }
}

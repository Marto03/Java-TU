public class Student {
    private String Egn;

    public String getEgn() {
        return Egn;
    }

    public void setEgn(String egn) throws StudentException {
        if (Egn.matches("\\d{10}")) {
            this.Egn = egn;
        } else {
            throw new StudentException();
        }
    }

    private String fNum;

    public String getfNum() {
        return fNum;
    }

    public void setfNum(String fNum) throws StudentException {
        if (fNum.matches("\\d{9}")) {
            this.fNum = fNum;
        } else {
            throw new StudentException();
        }
    }
}

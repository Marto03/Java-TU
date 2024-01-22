public class person{
    private int n;
    private int n1;
    public person(int n, int n1) {
        this.n = n;
        this.n1 = n1;
    }
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN(){
        return n;
    }
    public void setN(int n){
        this.n = n;
    }
    public person(int num){
        this.n = num;
    }
    public String toString(){
        return n + " "+ n1;
    }

}
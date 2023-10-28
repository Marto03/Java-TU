public class App {
    public static void main(String[] args) {
        Laptop l = new Laptop(4, 4);
        Laptop l1 = new Laptop(5,6);
        System.out.println(l.ToString());
        
        boolean x = l.isBetter(l1);
        System.out.println(x);
    }
}

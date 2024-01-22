public class App {
    public static int nod(int m, int n) {
        while (n != 0) {
            int rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }

    public static void main(String[] args) throws Exception {
        int a[] = { 9, 18, 81, 90 };
        int g = a[0];
        for (int i = 0; i < a.length; i++) {
            g = nod(g, a[i]);
        }
        System.out.println(g);
    }
}

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class App {
    public static int[] A = new int[100];
    public static int[] B = new int[100];
    public static int[] C = new int[100];

    public static int[] Combined() {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>(); // Return the elements without duplicate
        Set<Integer> setC = new HashSet<>();

        // Return the elements duplicated
        // List<Integer> setA = new ArrayList<Integer>();
        // List<Integer> setB = new ArrayList<Integer>();
        // List<Integer> setC = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            setA.add(A[i]);
            setB.add(B[i]);
            setC.add(C[i]);
        }
        setA.retainAll(setB);
        setA.retainAll(setC);

        int[] D = new int[setA.size()];
        int i = 0;
        for (int element : setA) {
            D[i++] = element;
        }
        return D;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            A[i] = random.nextInt(100) + 1;
            B[i] = random.nextInt(100) + 1;
            C[i] = random.nextInt(100) + 1;
        }
        int[] combined = Combined();
        for (int i = 0; i < combined.length; i++) {
            System.out.println(combined[i]);
        }
    }
}

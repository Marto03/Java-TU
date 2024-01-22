import java.util.Random;
import java.util.Scanner;

public class App {
    private static final int MIN = 101;
    private static final int MAX = 0;

    public static int averageS1(int[] A) {
        int min = MIN;
        int max = MAX;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        int middle = A.length / 2;
        System.out.println("Middle:" + middle);
        return (min + max + middle) / 3;
    }

    public static int averageS2(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                sum += A[i];
                count++;
            }
        }
        return sum / count;
    }

    public static void main(String[] args) throws Exception {
        int[] A;
        int average = 0;
        int average2 = 0;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input odd number between 1 and 100");
        int x;
        x = Integer.parseInt(scan.nextLine());
        if (x % 2 != 0) {
            A = new int[x];
            for (int i = 0; i < x; i++) {
                A[i] = rand.nextInt(100) + 1;
            }
            average = averageS1(A);
            average2 = averageS2(A);
        } else {
            System.out.println("invalid data");
        }

        System.out.println(average);
    }
}

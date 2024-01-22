import java.util.Arrays;
import java.util.Random;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }

}

public class App {
    // Метод за преобразуване на масив в двоично претърсващо дърво
    private static TreeNode arrayToBST(int[] array) {
        TreeNode root = null;
        for (int value : array) {
            root = insert(root, value);
        }
        return root;
    }

    // Метод за вмъкване на елемент в двоичното претърсващо дърво
    private static TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Метод за четене на елементите от двоично претърсващо дърво и записване в
    // масив
    private static int[] readBST(TreeNode root) {
        int[] result = new int[1000];
        readBSTHelper(root, result, new int[] { 0 });
        return result;
    }

    private static void readBSTHelper(TreeNode root, int[] result, int[] index) {
        if (root != null) {
            readBSTHelper(root.left, result, index);
            result[index[0]++] = root.data;
            readBSTHelper(root.right, result, index);
        }
    }

    // Метод за отпечатване на масив
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // ============================================================
    public static int TwentySecondNum(int[][] arr) {
        int[] diagonal = new int[30];
        for (int i = 0; i < 30; i++) {
            diagonal[i] = arr[i][i];
        }
        Arrays.sort(diagonal);
        for (int i = 0; i < 30; i++) {
            System.out.print(diagonal[i] + " ");
        }
        System.out.println();
        return diagonal[21];
    }

    public static void main(String[] args) throws Exception {
        // int[][] A = new int[30][30];
        // for (int i = 0; i < A.length; i++) {
        // for (int j = 0; j < A[i].length; j++) {
        // A[i][j] = (int) (Math.random() * 100) + 1;
        // }
        // }
        // int x = TwentySecondNum(A);
        // System.out.println(x);
        // for (int i = 0; i < A.length; i++) {
        // for (int j = 0; j < A[i].length; j++) {
        // System.out.print(A[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Инициализация на масив със случайни числа от 1 до 100
        int[] array = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }

        // Отпечатване на началния масив за проверка
        System.out.println("Начален масив:");
        printArray(array);

        // Създаване на двоично претърсващо дърво от елементите на масива
        TreeNode root = arrayToBST(array);

        // Четене на елементите от дървото и записване в сортиран масив
        int[] sortedArray = readBST(root);

        // Освобождаване на паметта, заета от дървото
        root = null;

        // Отпечатване на сортирания масив за проверка
        System.out.println("Сортиран масив:");
        printArray(sortedArray);
    }
}

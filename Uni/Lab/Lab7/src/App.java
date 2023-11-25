import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Device> arr1 = new ArrayList<>();
        ArrayList<BrokenDevice> arr2 = new ArrayList<>();
        Service s = new Service(arr1, arr2);
        Scanner scan = new Scanner(System.in);
        s.AddDevice(scan);
        // for (Device d : arr1) {
        // System.out.println(d);
        // }
        s.InputToFile(arr1);
        // s.ReadFromFile();
        for (Device d : arr1) {
            System.out.println(d);
        }
        System.out.println(arr1);
        System.out.println(arr2);
    }
}

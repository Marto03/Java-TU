import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Device> arr1 = new ArrayList<>();
        ArrayList<BrokenDevice> arr2 = new ArrayList<>();
        Service s = new Service(arr1, arr2);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            s.AddDevice(scan);

        }
        // for (Device d : arr1) {
        // System.out.println(d);
        // }
        s.InputToFile(arr1);
        // s.ReadFromFile();
        for (Device d : arr1) {
            System.out.println(d);
        }
        // System.out.println("Arr1 Working devices");
        // System.out.println(arr1);
        // System.out.println("Arr2 Broken Devices");
        // System.out.println(arr2);

        // System.out.println("Arr1 Working devices");
        // System.out.println(arr1);
        // System.out.println("Arr2 Broken Devices");
        // System.out.println(arr2);

        // float p = s.Price(arr1, arr2);
        // System.out.println(p);

        s.SameSymptoms(arr2.get(0), arr2.get(1));
    }
}

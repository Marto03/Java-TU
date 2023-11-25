import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Service implements Serializable {
    private ArrayList<Device> arrL1;

    public ArrayList<Device> getArrL1() {
        return arrL1;
    }

    public void setArrL1(ArrayList<Device> arrL1) {
        this.arrL1 = arrL1;
    }

    private ArrayList<BrokenDevice> arrL2;

    public ArrayList<BrokenDevice> getArrL2() {
        return arrL2;
    }

    public void setArrL2(ArrayList<BrokenDevice> arrL2) {
        this.arrL2 = arrL2;
    }

    public Service(ArrayList<Device> arrL1, ArrayList<BrokenDevice> arrL2) {
        this.arrL1 = arrL1;
        this.arrL2 = arrL2;
    }

    public void InputToFile(ArrayList<?> s) {
        try (
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("TestDevices1"))) {
            out.writeObject(s);
            out.flush();
            out.close();
        } catch (IOException e) {
            System.err.println("Serialization problem: " + e.getMessage());
            return;
        }
    }

    public void ReadFromFile() throws ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("TestDevices1"))) {
            Object o = in.readObject();
            if (o instanceof ArrayList) {
                ArrayList<?> restoredList = (ArrayList<?>) o;
                for (Object item : restoredList) {
                    if (item instanceof Device) {
                        arrL1.add((Device) item);
                    } else if (item instanceof BrokenDevice) {
                        arrL2.add((BrokenDevice) item);
                    } else {
                        System.out.println("Invalid Object");
                    }
                }
            } else {
                System.out.println("Invalid Object");
            }
        } catch (IOException es) {
            System.out.println("Deserialization problem: " + es.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Unknown object: " + e.getMessage());
        }
    }

    public void AddDevice(Scanner scan) {
        System.out.println("Input device 1.(Device) , 2.(Broken device)");
        try {
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    scan.nextLine();
                    System.out.println("Input Brand:");
                    String brand = scan.nextLine();
                    System.out.println("Input model: ");
                    String model = scan.nextLine();
                    System.out.println("Input price: ");
                    float price = scan.nextFloat();
                    Device d = new Device(brand, model, price);
                    arrL1.add(d);
                    System.out.println("Created!");
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Input Brand:");
                    String brandB = scan.nextLine();
                    System.out.println("Input model: ");
                    String modelB = scan.nextLine();
                    System.out.println("Input price: ");
                    float priceB = scan.nextFloat();
                    scan.nextLine();
                    System.out.println("Input symptoms: ");
                    String symptoms = scan.nextLine();
                    System.out.println("Input days for repair: ");
                    int days = scan.nextInt();
                    BrokenDevice bd = new BrokenDevice(brandB, modelB, priceB, symptoms, days);
                    arrL2.add(bd);
                    System.out.println("Created!");
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid choice");
        }
    }

    public void MoveToRepaired(BrokenDevice o) {
        arrL1.add(o);
        arrL2.remove(o);
    }

    public void SameSymptoms(BrokenDevice d, BrokenDevice d1) {
        Collections.sort(arrL2, new BrokenSymptomsDevices());
        for (BrokenDevice x : arrL2) {
            System.out.println(x);
        }
    }

    public float Price(ArrayList<Device> arr, ArrayList<BrokenDevice> arr2) {
        float s = 0;
        for (Device d : arr) {
            s += d.getPrice();
        }
        for (BrokenDevice bd : arr2) {
            s += bd.getPrice();
        }
        return s;
    }

}

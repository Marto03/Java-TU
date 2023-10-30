import java.sql.Array;
import java.util.Scanner;

public class House extends Building {
    private int floors;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    Array x = new Array(10) {
        
    };

    public House(int meters, float area, String address, int f, String n) {
        super(meters, area, address);
        this.floors = f;
        this.owner = n;
    }

    public void InputHouse(Scanner scan) throws InvalidHouseException {
        System.out.println("Input meters:");
        int m = scan.nextInt();
        System.out.println("Input area");
        float area = scan.nextFloat();
        System.out.println("Input address:");
        String address = scan.nextLine();
        System.out.println("Input floors:");
        int floors = scan.nextInt();
        System.out.println("Input owner name:");
        String name = scan.nextLine();
        if (m <= 0 || area <= 0 || floors <= 0) {
            throw new InvalidHouseException();
        } else {
            PrintHouse(m, area, address, floors, name);
        }
    }

    public void PrintHouse(int m, float area, String address, int f, String n) {
        System.out.println("The house's parameters: ");
        System.out.println("Height: " + m + " Area:" + area + " Adress:"
                + address + "Floors: " + f + "Owner name:" + n);
    }
    public

}

import java.util.ArrayList;
import java.util.Scanner;

public class EventLog {
    ArrayList arrayList = new ArrayList<>();

    public EventLog(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public void AddEvent(Scanner scan) throws LengthException {
        System.out.println("Input how much elements to add");
        int x = scan.nextInt();
        if (x >= 100 || x <= 0) {
            throw new LengthException();
        } else {
            for (int i = 0; i < x; i++) {
                String z = scan.nextLine();
                arrayList.add(z);
            }
        }
    }

    public void Print() {
        System.out.println(arrayList.toString());
    }

    public void Delete(String n) throws InvalidElement {
        if (!arrayList.contains(n)) {
            throw new InvalidElement();
        } else {
            arrayList.remove(n);
        }
    }

}

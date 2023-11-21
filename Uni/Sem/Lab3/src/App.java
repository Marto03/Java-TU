import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        final String filePath = "person.bin";
        Person[] array = {
                new Person("Ime", LocalDate.of(2003, 2, 23), 23),
                new Person("Name2", LocalDate.of(123, 12, 2), 34),
                new Person("Name3", LocalDate.of(1430, 4, 24), 65)
        };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(array);
        } catch (IOException e) {
            System.err.println("Wrong");
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            Person[] arrayPeople = (Person[]) in.readObject();
            for (Person person : arrayPeople) {
                System.out.println("Name: " + person.getName());
                System.out.println("Birth: " + person.getBirth());
                System.out.println("Age: " + person.getAge());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Wrong");
        }
    }
}

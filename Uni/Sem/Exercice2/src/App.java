import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Name", LocalDate.of(2003, 12, 5));
        System.out.println(p);
    }
}

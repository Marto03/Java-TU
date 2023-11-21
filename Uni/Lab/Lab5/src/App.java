import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Register");
        System.out.println("2. Log in");
        try {

            int x = scan.nextInt();
            scan.nextLine();
            switch (x) {
                case 1:
                    System.out.println("Input username:");
                    String name = scan.nextLine();
                    System.out.println("Input password: ");
                    String password = scan.nextLine();
                    System.out.println("Input password:");
                    String pass1 = scan.nextLine();
                    if (password.equals(pass1)) {
                        System.out.println("Input phone number: ");
                        String phone = scan.nextLine();
                        try {
                            User user = new User(name, password, phone);

                        } catch (NamesErrors | PassErrors | PhoneErrors e) {
                            System.err.println("Invalid user");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Input username:");
                    String user = scan.nextLine();
                    System.out.println("Input password: ");
                    String pass = scan.nextLine();
                    System.out.println("Input phone number: ");
                    int phone = scan.nextInt();

                default:
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("Wrong number!");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

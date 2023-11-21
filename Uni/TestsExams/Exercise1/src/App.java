import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a user:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.println("3. Teacher");
        int choice;
        String user;
        String pass;

        try {
            choice = scan.nextInt();
            scan.nextLine();
            System.out.println("Input username:");
            user = scan.nextLine();
            System.out.println("Input password:");
            pass = scan.nextLine();
            switch (choice) {
                case 1:
                    Admin admin = new Admin(user, pass);
                    String numberRegex = "\\d{9}";
                    String EGNRegex = "\\d{10}";
                    String emailRegex = "[a-zA-Z0-9]tu-sofia\\.bg";
                    String passwordTeacherRegex = ".{5,}";
                    System.out.println("Create account:");
                    System.out.println("Input student's f-Num:");
                    String number = scan.nextLine();
                    System.out.println("Input EGN:");
                    String EGN = scan.nextLine();
                    // System.out.println("Input Teacher's email: " + email.matches(emailRegex));
                    // String email = scan.nextLine();
                    // System.out.println("Input password for email: ");
                    // passwordTeacher = scan.nextLine();
                    System.out.println("Inputed EGN:" + EGN.matches(EGNRegex));
                    Grade s = new Grade();
                    s.setNumber(2);
                    Student st = new Student(EGN, passwordTeacherRegex);
                    st.grade(number, 2, 3.2f);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Wrong number!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

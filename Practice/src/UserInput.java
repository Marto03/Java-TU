import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextLine();
        System.out.println("What is your name: ");
        String name = scanner.nextLine(); 
        
        System.out.println("What is your age: ");
        
        int age = scanner.nextInt();
        scanner.nextLine(); // ---> to clear the buffer - works as fflush
        System.out.println("Hello "+name);
        System.out.println("You are "+age);
        scanner.close();
    }
}

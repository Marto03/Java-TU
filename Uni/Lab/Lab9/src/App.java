
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {

        int port = 1234;
        ServerSocket serverSocket = null;
        Socket connection = null;
        Scanner socketIn = null;
        PrintWriter socketOut = null;
        try {
            serverSocket = new ServerSocket(port);

            while (true) {

                System.out.println("Server is waiting for connection");
                connection = serverSocket.accept();

                System.out.println("Connected client: " + connection.getInetAddress().getHostName());
                System.out.println("Sending message to the client...");
                socketOut = new PrintWriter(connection.getOutputStream(), true);
                System.out.println("Server waiting for command...");
                socketOut.println("This is your chat bot. Choose between registering(1) and logging in (2)");
                socketIn = new Scanner(new BufferedReader(new InputStreamReader(connection.getInputStream())));
                Scanner scan = new Scanner(System.in);
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FileLog"));
                String command = null;
                String username = null;
                String password = null;
                String message = null;
                socketOut.flush();
                command = socketIn.nextLine();
                switch (command) {
                    case "1":
                        try {
                            socketOut.println("Input username:");
                            username = socketIn.nextLine();
                            socketOut.println("Input password:");
                            password = socketIn.nextLine();

                            User user = new User(username, password);
                            out.writeObject(user);
                            break;
                        } catch (NullPointerException e) {
                        }
                    case "2":
                        try {
                            socketOut.println("Input username:");
                            username = socketIn.nextLine();
                            socketOut.flush();
                            socketOut.println("Input password:");
                            password = socketIn.nextLine();
                            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("FileLog"))) {
                                Object o = in.readObject();
                                User restored = (User) o;
                                if (restored.getUserName() == username && restored.getPassword() == password) {
                                    socketOut.println("Logged in successfully");
                                    break;
                                }
                                in.close();
                            } catch (IOException e) {
                                System.out.println("Deserialization problem: " + e.getMessage());
                                return;
                            } catch (ClassNotFoundException e) {
                                System.out.println("Unknown object: " + e.getMessage());
                                return;
                            }
                            break;

                        } catch (NullPointerException e) {
                        }
                    default:
                        socketOut.println("Logged in");
                }
                do {
                    socketOut.flush();
                    command = socketIn.nextLine();

                    System.out.println("Client sent command " + command);
                    message = scan.nextLine();
                    socketOut.println(message);
                } while (!command.equalsIgnoreCase("exit"));
                System.out.println("Closing the connection " + connection.getInetAddress().getHostName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socketIn != null)
                    socketIn.close();
                if (socketOut != null)
                    socketOut.close();
                if (connection != null)
                    connection.close();
            } catch (IOException e) {
                System.err.println("Socket can't be closed");
            }
        }
    }
}

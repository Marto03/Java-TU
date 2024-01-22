import java.util.List;

public class Clients {
    private int Number;
    private String username;

    public Clients(int number, String username) {
        Number = number;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public synchronized void sendMessage(Ticket ticket, List<Ticket> inbox) {
        inbox.add(ticket);
        MyThread t = new MyThread(null);
        t.run();
        System.out.println("Message " + ticket.getTicketNumber() + " sent by client " + getUsername());
    }
}

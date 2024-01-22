import java.util.ArrayList;
import java.util.List;

public class App extends Thread {
    public static void main(String[] args) {
        MyThread thread = new MyThread(null);
        List<Ticket> inbox = new ArrayList<>();
        List<Ticket> resolved = new ArrayList<>();
        Clients customer = new Clients(1, "client1");
        Support support = new Support("support1", resolved);

        Ticket ticket1 = new Ticket("Problem 1");
        Ticket ticket2 = new Ticket("Problem 2");

        customer.sendMessage(ticket1, inbox);
        customer.sendMessage(ticket2, inbox);
        Ticket ticketToProcess = support.getTicketToProcess(inbox);
        Ticket ticket2ToProcess = support.getTicketToProcess(inbox);

        synchronized (thread) {
            if (ticketToProcess != null) {
                thread.run();
                System.out.println(
                        support.getUsername() + " working for fixing the problem " + ticketToProcess.getTicketNumber());
                System.out.println(support.getUsername() + " working for fixing the problem "
                        + ticket2ToProcess.getTicketNumber());
                support.resolveTicket(ticketToProcess);
                support.resolveTicket(ticket2ToProcess);
                support.getResolvedTickets();
            }
        }

    }
}
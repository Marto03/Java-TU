import java.util.List;

public class Support {
    public Support(String username, List<Ticket> resolvedTickets) {
        this.username = username;
        this.resolvedTickets = resolvedTickets;
    }

    private String username;
    private List<Ticket> resolvedTickets;

    public List<Ticket> getResolvedTickets() {
        return resolvedTickets;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public synchronized Ticket getTicketToProcess(List<Ticket> inbox) {
        for (Ticket ticket : inbox) {
            if (!ticket.isAssigned()) {
                ticket.setAssigned(true);
                return ticket;
            }
        }
        return null;
    }

    public synchronized void resolveTicket(Ticket ticket) {
        System.out.println("The problem " + ticket.getTicketNumber() + " has been fixed");
        resolvedTickets.add(ticket);
        ticket.setResolved(true);
    }
}

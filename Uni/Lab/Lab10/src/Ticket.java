public class Ticket {
    private static int ticketCounter = 0;
    private int ticketNumber;
    private String message;
    private boolean assigned;
    private boolean resolved;

    public Ticket(String message) {
        this.ticketNumber = ++ticketCounter;
        this.message = message;
        this.assigned = false;
        this.resolved = false;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public synchronized String getMessage() {
        return message;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}

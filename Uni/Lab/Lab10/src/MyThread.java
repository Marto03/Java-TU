public class MyThread extends Ticket implements Runnable {

    int sum = 0;

    public MyThread(String message) {
        super(message);
    }

    public void run() {
        synchronized (this) {
            this.setAssigned(isAssigned());
            notify();
        }
    }

    @Override
    public synchronized String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage();
    }

    @Override
    public int getTicketNumber() {
        // TODO Auto-generated method stub
        return super.getTicketNumber();
    }

    @Override
    public boolean isAssigned() {
        // TODO Auto-generated method stub
        return super.isAssigned();
    }

    @Override
    public boolean isResolved() {
        // TODO Auto-generated method stub
        return super.isResolved();
    }

    @Override
    public void setAssigned(boolean assigned) {
        // TODO Auto-generated method stub
        super.setAssigned(assigned);
    }

    @Override
    public void setResolved(boolean resolved) {
        // TODO Auto-generated method stub
        super.setResolved(resolved);
    }

}

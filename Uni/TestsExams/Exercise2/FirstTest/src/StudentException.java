public class StudentException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid format";
    }
}

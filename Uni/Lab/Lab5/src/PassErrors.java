public class PassErrors extends Exception {
    @Override
    public String getMessage() {
        return "Invalid password";
    }
}

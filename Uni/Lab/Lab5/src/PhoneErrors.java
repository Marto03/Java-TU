public class PhoneErrors extends Exception {
    @Override
    public String getMessage() {
        return "Invalid phone number";
    }
}

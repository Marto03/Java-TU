public class LengthException extends Exception {
    @Override
    public String getMessage() {
        return "Length of the list must be up to 100 elements";
    }
}

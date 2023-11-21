public class NamesErrors extends Exception {
    @Override
    public String getMessage() {
        return "Invalid name";
    }
}

public interface IValidatePhone {
    public static boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.equals("[0-9][10]")) {
            return true;
        }
        return false;
    }
}

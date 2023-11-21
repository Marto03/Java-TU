public interface IValidatePhone {
    static boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10 && phoneNumber.matches("\\d")) {
            return true;
        }
        return false;
    }
}

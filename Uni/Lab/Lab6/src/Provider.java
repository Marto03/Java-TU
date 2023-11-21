public class Provider implements IValidatePhone {
    private String name;
    private String phoneNum;

    public Provider(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) throws WrongPhoneNumberException {
        if (IValidatePhone.validatePhoneNumber(phoneNum)) {
            this.phoneNum = phoneNum;
        } else {
            throw new WrongPhoneNumberException();
        }
    }

}

public class Admin extends User {

    public Admin(String name, String pass) {
        super(name, pass);
    }

    @Override
    public UserType getUserType() {
        return UserType.ADMIN;
    }

}

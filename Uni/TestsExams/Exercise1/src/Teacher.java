public class Teacher extends User {

    public Teacher(String name, String pass) {
        super(name, pass);
    }

    public UserType getUserType() {
        return UserType.TEACHER;
    }

}

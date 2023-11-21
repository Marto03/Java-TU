enum UserType {
    ADMIN,
    STUDENT,
    TEACHER
}

public abstract class User {
    private String username;
    private String password;

    public User(String name, String pass) {
        this.username = name;
        this.password = pass;
    }

    public abstract UserType getUserType();

}

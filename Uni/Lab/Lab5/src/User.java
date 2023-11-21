import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User implements IValidatePhone {

    private String username;
    private String password;
    private int phoneNumber;
    Pattern p;
    Matcher m;

    public User(String username, String password, String phoneNumber) throws NamesErrors, PassErrors, PhoneErrors {
        setUsername(username);
        setPassword(password);
        setPhoneNumber(phoneNumber);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws NamesErrors {
        p.compile("[a-z0-9_][3,15]");
        m = p.matcher(username);
        if (m.matches()) {
            this.username = username;
        } else {
            throw new NamesErrors();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PassErrors {
        p.compile("[a-zA-Z][11]");
        m = p.matcher(password);
        if (m.matches()) {
            this.password = password;
        } else {
            throw new PassErrors();
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneErrors {

        p.compile("[0-9][10]");
        boolean flag = IValidatePhone.validatePhoneNumber(phoneNumber.toString());
        if (flag) {
            this.phoneNumber = Integer.parseInt(phoneNumber);
        } else {
            throw new PhoneErrors();
        }
    }
}

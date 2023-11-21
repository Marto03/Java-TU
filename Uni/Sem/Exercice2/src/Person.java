import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.time.LocalDate;

public class Person implements Externalizable {

    private String name;
    private LocalDate birth;
    private int age;
    private transient String address;

    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
        this.age = age();
        this.address = null;
    }

    private int age() {
        return LocalDate.now().getYear() - birth.getYear();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        birth = (LocalDate) in.readObject();
        age = in.readInt();
        address = (String) in.readObject();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(birth);
        out.writeInt(age);
        out.writeObject(address);
    }

}

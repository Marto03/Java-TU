import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private LocalDate birth;

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    private int age;

    public Person(String name, LocalDate birth, int age) {
        this.name = name;
        this.birth = birth;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return ("Name:" + getName() + " Birth: " + getBirth() + " Age:" + getAge());
    }

}

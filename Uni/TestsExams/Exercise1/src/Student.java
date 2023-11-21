public class Student extends User {

    public Student(String name, String pass) {
        super(name, pass);
    }

    public UserType getUserType() {
        return UserType.STUDENT;
    }

    Grade[] list = new Grade[10];

    public Grade grade(String predmet, int number, float gr) {
        Grade grades = new Grade();
        grades.setPredmet(predmet);
        grades.setNumber(number);
        grades.setYearlyGrade(gr);
        return grades;
    }

}

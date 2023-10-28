public class Teacher extends Person {
    private Course course1;
    private int yearsExperience;
    public Teacher(String name, String egn,Course randomCourse, int yearsExperience)
    {
        super(name, egn);
        this.course1 = randomCourse;
        this.setYearsExperience(yearsExperience);
    }
    public int getYearsExperience()
    {
        return this.yearsExperience;
    }
    public void setYearsExperience(int n)
    {
        this.yearsExperience = n;
    }

    public Course getCourse1()
    {
        return this.course1;
    }
    public void setCourse1(Course smth)
    {
        this.course1 = smth;
    }
}

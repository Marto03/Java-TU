public class Course {
    private String course;
    public String getCourse()
    {
        return course;
    }
    public void setCourse(String name)
    {
        this.course = name;
    }
    public Course(String n)
    {
        this.setCourse(n);
    }
}

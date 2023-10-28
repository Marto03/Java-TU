public class Test {
    public static void main(String[]args)
    {
        Student s = new Student(2.3, 0, 0, 0);
        s.changeDegPik(3);
        People p = new People();
        s.setDate("12.32.3");
        System.out.println(s.getPikD()+ " " + s.getDate());
    }
}

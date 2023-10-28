public class Test {

	public static void main(String[] args) 
    {
		Person p2 = new Person("Ivan", "0302130879");
		System.out.println(p2.getName());
		p2.sayHi();
		Person.printSomething();

		Course c = new Course("s");

        c.setCourse("New course");
        System.out.println(c.getCourse());
		Student s1 = new Student("Georgi", "0302130879", "122213091");
		System.out.println(s1.getName());

        Course c1 = new Course("Something");
        Teacher teach = new Teacher("Name", "12122201", c1, 3);
        System.out.println(teach.getName() + " " + teach.getCourse1().getCourse());

        // Teacher.printSomething();
        // Teacher t = new Teacher("Ivan", "121222018", 123);
        // System.out.println(t.getYearsExperience());

        // t.setCourse("Software");
        // System.out.println(t.getCourse());

	}

}

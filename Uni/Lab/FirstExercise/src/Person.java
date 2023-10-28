public class Person {
	
	private String name;
	private String egn;

	public Person(String n, String e) {
		this.name = n;
		this.egn = e;
	}
	
	public Person() {
		this.name = "";
		this.egn = "";
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}

	public String getEgn() {
		return this.egn;
	}
	public void setEgn(String n) {
		this.egn = n;
	}
	
	public static void printSomething() {
		System.out.println("Hi");
	}
	
	public void sayHi() {
		System.out.println("Hi, my name is " + this.name);
	}
	
}

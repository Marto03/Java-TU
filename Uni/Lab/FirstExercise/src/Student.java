public class Student extends Person {

	private String fNum;

	public Student() {
		super();
		setfNum("");
	}

	public Student(String name, String egn, String fNum) {
		super(name, egn);
		this.setfNum(fNum);
	}

	public String getfNum() {
		return fNum;
	}

	public void setfNum(String fNum) {
		this.fNum = fNum;
	}

}

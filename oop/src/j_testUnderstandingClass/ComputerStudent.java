package j_testUnderstandingClass;

class Colleage{
	public void checkColleage() {
		System.out.println("부모꺼");
	}
}

public class ComputerStudent extends Colleage{

	private String hanbun;
	private String name;
	
	public ComputerStudent() {}
	
	public ComputerStudent(String name) {
		this.name = name;
	}
	
	public void checkColleage() {
		System.out.println("자식꺼");
	}

	public void info() {
		System.out.println("학생정보");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

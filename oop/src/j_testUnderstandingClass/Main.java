package j_testUnderstandingClass;

public class Main {

	public static void main(String[] args) {
		
		ComputerStudent cs = 
				new ComputerStudent();
		//cs.name = "홍길동";
		cs.setName("홍길동");
		
		Colleage cs2 = 
				new ComputerStudent("홍가네");
		
		cs2.checkColleage();
		
	}

}

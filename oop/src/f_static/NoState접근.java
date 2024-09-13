package f_static;

public class NoState접근 {

	String name = "hongildong";
	public static void main(String[] args) {

		NoState접근 obj = new NoState접근();
		System.out.println("client: " + obj.name);
	}

}

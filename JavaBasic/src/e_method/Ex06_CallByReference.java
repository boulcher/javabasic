package e_method;

public class Ex06_CallByReference {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		
		add(a, b);
		System.out.println("2. A=" + a + ", B=" + b);

	}
	
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b);
		System.out.println("1. A=" + a + ", B=" + b);
	}

}

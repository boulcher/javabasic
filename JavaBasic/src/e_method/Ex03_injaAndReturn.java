package e_method;

public class Ex03_injaAndReturn {

	public static void main(String[] args) {

		//data
		int a = 10, b = 20;
		int sum = add(a, b);
		//결과
		System.out.println("합: " + sum);
		
	}
	
	static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

}

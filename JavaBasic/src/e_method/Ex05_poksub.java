package e_method;

public class Ex05_poksub {

	public static void main(String[] args) {
		
		int data1 = 1000;
		double data2 = 1.99;
		
		String result = method(data1, data2);
		//msg의 값을 출력
		System.out.println(result);

	}
	
	static String method(int data1, double data2) {
		//data1 와 data2의 값을 여기서 출력
		System.out.println(data1);
		System.out.println(data2);
		
		String msg = "안녕하세요";
		return msg;
	}
}

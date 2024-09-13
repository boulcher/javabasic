package e_method;
//return 할 때 단 하나의 값을 반환가능
public class Ex02_return {

	public static void main(String[] args) {

		int sum = add();
		System.out.println("sum: " + sum);
	}
		
	static int add() {
		//data
		int a = 10, b = 20;
		int sum = a + b;
		return sum;
	}
}

package e_method;

public class Ex08_excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiple(2, 3);
		multiple(4, 'ㅋ');
		multiple(2, 3, 'ㅋ');
		
	}
	static void multiple(int a, int b) {
		System.out.println(a * b);
	}
	
	static void multiple(int a, char ch) {
		for(int i = 0; i < a; i++) {
			System.out.println(ch);
		}
		System.out.println();
	}

	static void multiple(int n, int m, char ch) {
		System.out.println();
	}

}

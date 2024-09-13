package a_datatype;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		if ( a>3 && ++a>3) {
			System.out.println("조건만족");
		}
		
		System.out.println("A=" + a);
		
		//------------------------------
		int b = 3;
		if ( b > 1 || ++b > 3) {
			System.out.println("조건만족2");
		}
		System.out.println("B=" + b);
	}

}

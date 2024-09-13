package a_datatype;

public class Ex07_이진논리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;		// 00000000	00000000	00000000	00001111
		int b = 10;		// 00000000	00000000	00000000	00001010
		
		int and = a & b;	// 00000000	00000000	00000000	00001010
		System.out.println("and =" + and); //AND operator
		
		int xxx = a | b;
		System.out.println("xxx " + xxx);	//OR operator
		
		int wow = a ^ b;
		System.out.println("wow " + wow);	//XOR operator (exclusive or)
	}

}

/*
논리연산자(이진)
 * 
 * A  B			A & B		A | B		A ^ B
 * --------------------------------------------
 * 0  0			  0			  0			  0
 * 0  1			  0			  1			  1
 * 1  0			  0			  1			  1
 * 1  1			  1			  1			  0
 */
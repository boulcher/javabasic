package c_control;

public class Ex06_for중첩_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//alphabet from a to z print
//		for(int i = 0; i < 26; i++) {
//			for(char ch = 'A'; ch <= 26 - i; ch++) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}

		// backup
//		for (int i = 0; i < 26; i++) {
//			for (int j = 0; j < 26; j++) {
//				System.out.print((char) ('A' + j));
//			}
//		}

		// 문제1
//		for (int i = 0; i < 26; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print((char) ('A' + j));
//			}
//			System.out.println();
//		}

//		// 문제2
//		for (int i = 0; i < 26; i++) {
//			for (int j = 0; j < 26 - i; j++) {
//				System.out.print((char) ('A' + j));
//			}
//			System.out.println();
//		}
		
//		//문제3 alphabet from z to a print
//		for (int i = 0; i < 26; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print((char) ('Z' - j));
//			}
//			System.out.println();
//		}
		
	//문제 4 	
		
		for (int i = 0; i < 26; i++) {
			for (int j = 0+i; j < 26; j++) {
				System.out.print((char) ('A' + j));
			}
			System.out.println();
		}
	}

}

//int su = 1;
//for(int i = 0; i < row; i++) {
//	for(int j = 0; j < col; j++) {
//		System.out.print(su + " ");
//		su++;
//	}
//	System.out.println();
//}
package c_control;

public class Ex06_for중첩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int j = 0; j < 5; j++) {
//		
//			for(int i = 0; i <5; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		
		
		
		//____________
		for(int j = 2; j <=9; j++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", j, i, j * i);
			}
			System.out.println();
		}
		
		

//		//----------2-----------------------
//		
//		for(int j = 0; j < 5; j++) {
//			
//			for(int i = 0; i <j + 1; i++) { //j = 0 ga teng va unga 1 qoshiladi shunda birinchi qatorda bitta *
//				System.out.print("*");			//shunaqa bop pastga + 1 ta qoshilib boradi
//			}
//			System.out.println();
//		}		
//		
////--------3---------------------------------------		
//		for(int j = 0; j < 5; j++) { //5칸
//			
//			for(int i = 0; i < 5 - j; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		//------------4--------------------------------
//		
//		for(int j = 0; j < 5; j++) { //5칸
//			
//			for(int i = 0; i<j; i++) {
//				System.out.print(" ");
//			}
//			
//			for(int i = 0; i < 5 - j; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}

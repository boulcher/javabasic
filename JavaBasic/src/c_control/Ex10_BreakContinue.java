package c_control;

/*
 * break : blockil posonanun munjang
 * continue : block kkitiro idonghanun munjang
 */

public class Ex10_BreakContinue {

	public static void main(String[] args) {
		

//		for(int j = 0; j < 3; j++) {
//			if(j == 1) break;
//			System.out.printf("< %d > \n", j);
//		}
//		System.out.println("Data");
		
		END:	//bu label diyiladi. maqsad, umumiy blockdan chiqib ketish
		for(int i = 0; i<2; i++) {
		
		for(int j = 0; j < 3; j++) {
			if(j == 1)  continue END; 
			System.out.printf("< %d, %d > \n", i, j);
		}
		System.out.println("Data");
		}
	}

}

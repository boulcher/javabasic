package c_control;

enum Size{
	SMALL,
	MEDIUM,
	LARGE
}


public class EX04_switch_enum {

	public static void main(String[] args) {

		int size = 1; //ekranda chiqadigan miqdorni tasavvur qil
		
		switch(size) {
		case SMALL:	System.out.println("small"); break;
		case MEDIUM:	System.out.println("medium"); break;
		case LARGE:	System.out.println("large"); break;
		}
		
		
		
		
//		switch(size) {
//		case 1:	System.out.println("small"); break;
//		case 2:	System.out.println("medium"); break;
//		case 3:	System.out.println("large"); break;
//		}
		

		/*
		 * 	small : 1, medium : 2, large : 3으로 프로그램 처리
		 */
	}

}

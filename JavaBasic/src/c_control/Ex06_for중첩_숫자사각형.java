package c_control;

import java.util.Scanner;

public class Ex06_for중첩_숫자사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개 입력 ->");
		int row = input.nextInt();
		int col = input.nextInt();
		
		int su = 1;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(su + " ");
				su++;
			}
			System.out.println();
		}
		
		
//		for(int i = 0, su = 1; i < row; i++) {
//			for(int j = 0; j < col; j++, su++) {
//				System.out.print(su + " ");
//			}
//			System.out.println();
//		}
		
	}

}

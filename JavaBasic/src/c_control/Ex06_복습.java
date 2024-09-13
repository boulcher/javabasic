package c_control;

import java.util.Scanner;

public class Ex06_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number ->");
		int su = input.nextInt();
		
		for(int i = 0; i < su; i++) {
			// 공백을 추가
			for(int j = 0; j < su-i-1; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}

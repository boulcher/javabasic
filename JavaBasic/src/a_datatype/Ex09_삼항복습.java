package a_datatype;

import java.util.Scanner;

public class Ex09_삼항복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		//두 수 중에서 큰수를 출력
		 int a = 15, b = 40;
		 
		 int max;
		 if( a > b) {
			 max = a;
		 }else {
			 max = b;
		 }
		 System.out.println("두 수 중 큰수는 " + max);
		 */
		
		// 두 수를 입력하고 그 두 수 중에서 큰 값 출력 (삼항연산자 이용)
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter to first digit ->");
		int firstDigit = input.nextInt();
		System.out.println("enter second digit ->");
		int secondDigit = input.nextInt();
		
		int max = (firstDigit > secondDigit)? firstDigit : secondDigit;
		System.out.println("biggest digit " + max);
		
	}

}

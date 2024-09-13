package c_control;

import java.util.Scanner;

/*
 * 	- for문
 * 	- while문
 * 	- do~ while문
 * 
 * 	for(초기치; 조건문; 증가치) {
 * 		반복문장;	
 *  }
 *  
 *  초기치;
 *  while(조건문) {
 *  	반복문장;
 *  	증가치;
 *  }
 */


public class Ex07_while_개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum +=i;
//		}
//		System.out.println("sum: " + sum);
		
//		int sum = 0;
//		int i = 1;
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("sum: " + sum);
		
		//단 수를 입력하받아 구구단 출력
//		Scanner input = new Scanner(System.in);
//		System.out.println("단 입력 ->");
//		int dan = input.nextInt();
//		// [ex] 2*1=2
//		//
//		//		2*9=18
//		int i = 1;
//		while(i <=9) {
//			System.out.printf(" %d * %d = %d \n", dan, i, dan*i);
//			i++;
//		}
		
		int dan = 1;
		for(int i = 2; i < 10; i++) {
			System.out.printf("%d * %d = %d \n", i, dan, i * dan);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d \n", j, dan, j * dan);
				
			}
			System.out.println();
		}
	}

}
	


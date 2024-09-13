package c_control;

import java.util.Scanner;

public class Ex05_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*문제 1)1~ ㅜ까지츼 숫자를 다음처럼 출력
		1 2 3 4 5
		6 7 8 9 10 
		11 12 13 14 15
		 */
		//		for(int i = 1; i <= 15; i++) {
		//			System.out.println(i + "");
		//			if(i % 5 == 0) {
		//				System.out.println();
		//			}
		//		}

		/*
		 * 문제 2) 문자열 처리하기
		 * 문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고
		 * N이 대문자이면 문자 N부터 Z까지 출력하라
		 * 그 밖의 문자가 입력되면 Eror를 출력하라
		 */

		Scanner input = new Scanner(System.in);
//		System.out.println("문자 하나를 입력하세요 ->");
//		//char ch = input.next().charAt(0);
//		char ch = input.next().charAt(0);
//
////		 소문자인지 여부
//		if(ch >='a' & ch <='z') { 
//			for(char i = ch ; i <= 'z' ; i++ ) { //masalan, s kiritsam 's'dan 'z'gacha bogan qatorni chiqarish un
//				System.out.print(i);				//for loop ichidagi char i = 'a'ni ch variablega almashtirdim
//			}										// i <= 'z'ni ham ch ga almashtirdim
//		}else if(ch >='A' & ch <='Z') {		// bu yerdayam xuddi shunaqa
//			for(char i = ch ; i <= 'Z' ; i++ ) {
//				System.out.print(i);
//			}	
//		}else {
//			System.out.println("Error");
//		}

//		-----------------------------------------------------------------------------
//		문제3 ) 입력받은 문자열의 뒤집어서 출력하세요
//		[예]  입력 -> 출력
//		안녕 친구  -> 구친 녕안
//		CarpeDiem  -> meiDepraC 
//		[힌트] 문자열의 길이 구할 때   length() 이용

		
		System.out.println("단어 하나를 입력하시오 ->");
		String word = input.next();
		
		
		
	}
}
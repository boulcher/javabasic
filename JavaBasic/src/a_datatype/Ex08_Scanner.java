package a_datatype;

/*
 * 	자바에서 콘솔 입력받는 방법
 * 
 * 		- java.util.Scanner 클래스 이용
 * 		
 * 		- 정수형입력시 : nextInt()
 * 		- 실수형입력시 : nextDouble()
 * 		- 문자열입력시 : next() / nextLine()  ***[숙제] 차이점???
 *  
 */

import java.util.*;	//Scanner inputdan foydalanish un shunaqa yoziladi main ustiga

public class Ex08_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math;
		
		Scanner input = new Scanner(System.in); 
		//Buni qilishdan maqsad, user komputerga data kirita olishi un
		System.out.println("국어입력->");
		kor = input.nextInt();
		
				//영어범수입력받기, 수학점수입력받기, 출력
		
		System.out.println("국어:" + kor);
		eng = input.nextInt();
		System.out.println("영어:" + eng);
		math = input.nextInt();
		System.out.println("수학:" + math);
		
		int total = kor + eng + math;
		int avg = total / 3;
		System.out.println("total is " + total);
		System.out.println("average sum is " + avg);
	}

}

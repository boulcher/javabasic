package d_array;

import java.util.Scanner;

public class Ex02_성적1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 0번 학생의 국어점수를 입력하세요 -> 88
 * 1번 학생의 국어점수를 입력하세요 -> 85
 * 2번 학생의 국어점수를 입력하세요 -> 90
 * 3번 학생의 국어점수를 입력하세요 -> 94
 * 4번 학생의 국어점수를 입력하세요 -> 75
 * 
 * 위 학생들의 총점은 xxx 입니다.
 * 위 학생들의 평균은 yyy 입니다.
 */
		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력하세요 ->");
		int su = input.nextInt();
		
		int [] kor = new int[su];
		
		for(int i = 0; i < kor.length; i++) {
			System.out.println(i + "번 학생의 국어점수를 입력하세요 ->");
			kor[i] = input.nextInt();
		}
		
		// 총점구하기
		int total = 0;
		for(int i = 0; i < kor.length; i++) {
			total += kor[i];
		}
		
		
		
		// 총점과 평균 출력
		System.out.println("총점:" + total);
		System.out.println("평균:" + total/kor.length);
		
		
	}

}

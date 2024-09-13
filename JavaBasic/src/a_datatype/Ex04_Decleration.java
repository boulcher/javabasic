package a_datatype;

public class Ex04_Decleration {
	public static void main(String[] args) {
		/*
		int kor;	//변수를 선언하는 것이다
		kor = 30;	//값 대입
		
		// 초기화 = 변수선언 + 값대입
		int eng = 30;
		*/
		
		int kor = 30, eng = 50;

		
		//두 점수 맞바꾸기
		//kor = 30, eng = 50;
		//[바뀐 뒤] kor = 50, eng = 30;
		
		int temp = kor;
		kor = eng;
		eng = temp;
		System.out.println("국어:" + kor + ", 영어=" + eng);
		System.out.printf("korean: %d, english= %d\n\n\n", kor, eng);
		/*
		 * 만약에 국어점수와 영어점수가 동일하니
		 * 그렇다면 "두 점수가 동일"이라고 출력
		 * 그렇지 않으면 "두 점수가 다름"이라고 출력
		 */
		if(kor == eng) {
			System.out.println("tho grades are equel");
		}else {
			System.out.println("two grades are different");
		}
		
		
	}

}

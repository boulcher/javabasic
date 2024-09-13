package a_basic;

public class Student {

	// member fields : member valuable 를(서로 다른 자료형)
	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	//member methods : 멤보함수들
	int calTotal() {
		total = kor + eng + math;
		return total;
	}
	double calAvg() {
		avg = (double)total / 3;
		return avg;
	}
}

/*
		클래스 이름과 java 파일명이 동일
		대ㅐ소문자 구별
		
		[권장]	클래스일음은 대문자로 시작
*/

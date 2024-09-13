package d_array;

public class Student {

	// member fields : member valuable를(서로 다른 자료형)
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	//member methods : 멤보함수들
	public int calTotal() {
		total = kor + eng + math;
		return total;
	}
	public double calAvg() {
		avg = (double)total / 3;
		return avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}

/*
		클래스 이름과 java 파일명이 동일
		대ㅐ소문자 구별
		
		[권장]	클래스일음은 대문자로 시작
*/

package c_control;

public class Ex04_switch_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 100, eng = 100, math = 100;
		int total = kor + eng + math;
		int avg = total / 3;
		System.out.println("Your avarage is " + avg);
		
		char score = '\u0000'; //this is really java style
		
		switch(avg/10) {
		case 10:	//break bolmaganiga davom etib bitta pastga tushib A oladi
		case 9: score = 'A'   ; break; //90/10=9
		case 8: score = 'B'   ; break;
		case 7: score = 'C'   ; break;
		default : score = 'F' ; 
		}
		
		System.out.println("your score is " + score);
	}

}
/*
평균을 구해서 90이사이면 'A' 학점
90미만 80 이상이면 'B' 학점
80미만 70 이상이면 'C' 학점
그 외는 'F'
*/
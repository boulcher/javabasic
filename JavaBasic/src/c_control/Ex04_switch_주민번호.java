package c_control;
/*
 * 분기문 switch
 * [주의] break 문장 확인
 * [주의] 문자열(char)/정수형(int/long)/문자열(String)
 */


public class Ex04_switch_주민번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "891229-1234528";
		char chul = id.charAt(8);
		//System.out.println(chul);
		String local = "";
		
		switch(chul) {
		case '0' : local = "서울";	break;
		case '1' : local = "인천/부산"; break;
		case '2' : local = "경기";	break;
		case '9' : local = "제주";	break;
		default	 : local = "한국";	
		}
		
		
		System.out.println("당신은 " + local + " 출신입니다");
	}
}

/*
 * 주민번호에서 출산지번호가
 * 	0 : 서울
 * 	1 : 인천/부산
 * 	2 : 경기
 * 	9 : 제주
 * 	나머지 : 한국
 */

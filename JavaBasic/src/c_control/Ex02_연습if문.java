package c_control;

public class Ex02_연습if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다

		 ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다

		 ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다  
		 */
		
		String id = "2018133001";
		String yearEntered = id.substring(0, 4);
		char dan = id.charAt(4);
		String 단과대 = "";
		//학과 구하기
		String 학과 = id.substring(5, 7);
		String deptName = "";
		
		
		
		
		if(dan == '1') {
			단과대 = "공과대";
			//System.out.println("당신의 단과대는 " + 단과대 + "입니다");
			if(학과.equals("11")) {
				deptName = "컴퓨터학과";
			}
			else if(학과.equals("12")) {
				deptName = "소프트웨어학과";
			}
			else if(학과.equals("13")) {
				deptName = "모바일학과";
			}
			else if(학과.equals("22")) {
				deptName = "자바학과";
			}
			else if(학과.equals("33")) {
				deptName = "서버학과";
			}
		}
		else if(dan == '2') {
			단과대 = "사회대";
			//System.out.println("당신의 단과대는 " + 단과대 + "입니다");
			if(학과.equals("11")) {
				deptName = "사회학과";
			}
			else if(학과.equals("12")) {
				deptName = "경영학과";
			}
			else if(학과.contentEquals("13"))
				deptName = "경제학과";
		}
		
		//if(단과대 == "공과대" && id.substring(4, 2) == "11") {
			
		//}
		
		String result = id + "는 " + yearEntered + "년도에 입학한 " + 단과대 + " " + deptName + " 학생입니다";
		System.out.println(result);
	}

}

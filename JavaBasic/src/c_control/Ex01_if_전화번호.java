package c_control;

public class Ex01_if_전화번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tel = "0505-222-2222";
		int idx = tel.indexOf('-');
			//System.out.println(idx);
		String localNum = tel.substring(0, idx); // 0번째부터
			//System.out.println(localNum);
		String local; //String local qoshmagunimcha kodim oxshamadi
		
		if(localNum.equals("02")) {  //localNum.euqals("raqam") qoshish kerak
			local = "서울";
			System.out.println(local + "입니다");
		}
		else if(localNum.equals("032")) {
			local = "인천";
			System.out.println(local + "입니다");
		}else {
			local = "한국";
			System.out.println(local + "입니다");
		}
		
		/*
		 *  지역번호가 02라면 "서울" 출력
		 *  그렇지 않고 지역번호가 032이라면 "인천" 출력
		 *  나머지 "한국" 출력 
		 */
	}

}
/*
	02-222-2222
	032-123-1234
	051-555-9876
	0505-123-1234
*/
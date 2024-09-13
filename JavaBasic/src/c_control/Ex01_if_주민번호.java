package c_control;

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "891229-0822803";
		char sung = id.charAt(7);
		System.out.println(sung);
		String gender = ""; // shu joyga String gender berib yoniga albatta "";  bosh joy qoldirish kerak
		
		if(sung == '5' || sung == '7' || sung == '9') {
			//System.out.println("남자");
			gender = "남자";
		}
		else if(sung == '6' || sung == '8' || sung == '0') {
			System.out.println("여자");
			gender = "여자";
		}
		
		System.out.println("당신은 " + gender + "입니다");
	}

}

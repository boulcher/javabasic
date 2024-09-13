import java.util.Calendar;

public class Ex03_나이구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "891229-1123258";
		//String id = "010101-4123256"
		String nai = id.substring(0,2); // age = "89"
		int sunai = Integer.parseInt(nai); // 문지열 "80" -> int형 80

		int age = 0;
		char sung = id.charAt(7);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);

		// 성별문자가 '1'이거나 '2'라면
/*		if(sung == '1' || sung == '2') {

			age = 2024 - (1900 + sunai) + 1;
		}
		else if(sung == '3' || sung == '4') {
			age = 2024 - (2000 + sunai) + 1;			
	*/	
		//System.out.println("한국나이 = " + age);
	
		// 성별문자가 '1'이거나 '2'라면
		if(sung == '1' || sung == '2') {

			age = year - (1900 + sunai) + 1;
		}
		else if(sung == '3' || sung == '4') {
			age = year - (2000 + sunai) + 1;
			
		}
		System.out.println("한국나이 = " + age);
		
	}
}

/*
	Wrapper class : 자료형 클래스

	int 	: integer
	long 	: Long
	double 	: Double
 */
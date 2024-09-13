package a_datatype;

public class HomeWork_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2100;
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year!");
		}else {
			System.out.println(year + " is NOT a leap year!");
		}
	}

}

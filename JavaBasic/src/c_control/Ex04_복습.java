package c_control;

import java.util.Scanner;

public class Ex04_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get input of tel number from the console and print the area name based on are code
		Scanner input = new Scanner(System.in);
		System.out.println("enter tel number including hyphens ->");
		String tel = input.nextLine();
		int idx = tel.indexOf('-');
		
		
		String area = tel.substring(0, idx);
		System.out.println(area);
		
		String local = "";
		
		switch(area) {
		case "02" : local = "서울";	break;
		case "032" : local = "인천"; break;
		case "031" : local = "경기";	break;
		case "064" : local = "제주";	break;
		default	 : local = "한국";	
		}
		
		System.out.println("Your tel number are code is from " + local);
	}

}


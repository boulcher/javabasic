package e_method;

import java.util.Scanner;

public class Ex99_poksub2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter score ->");
		int jumsu = input.nextInt();
		String result = pass(jumsu);
		//합격여부 출력
		System.out.println("결과:" + result);
		
	}
	
	/*
	 * 역할 : 입력받은 점수를 먼겨받아서
	 * 			80점 이상이면 '합격' 그렇지 않으면 '불합격' 확인
	 */
	static String pass(int jumsu) {
		String result = "";
		if(jumsu >= 80) result = "합격";
		else result = "불합격";
		//System.out.println(result);
		
		return result;
	}

}

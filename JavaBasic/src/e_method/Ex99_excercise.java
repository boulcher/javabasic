package e_method;

public class Ex99_excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subtract(a, b);
		//System.out.println(sum);
		
		
		greeting(1);
		loopMethod(10);
		
	}
	/*
	 * 1. 정수형 데이터(int) 2개를 매개변수로 받아서 뺄셈 연산을 수행하여 
	 * 결과값을 반환하는 subtract 메소드를 선언하고, 입력 받은 두 수를 인자로 보내서 
	 * 그 메소드를 호출하여 결과값을 출력하는 프로그램을 작성하시오.​
	 */

	static int subtract(int a, int b){
		int sum = a - b;
		return sum;
	}
	
	/*
	 * 2. 정수형 데이터 1개를 매개변수로 받아서 해당되는 문자열(인사말)을 모니터로 
	 * 출력하는 메소드 greeting를 선언하고, 입력 받은 정수형 데이터를 인자로 보내서 
	 * 그 메소드를 호출합니다.
		단, 그 정수 데이터에 따라 다음과 같은 인사말을 출력합니다.
		( 1-안녕하세요, 2-굿모닝, 3-올라, 4-곤니치와 )
	 */
	static void greeting(int x) {
		switch(x) {
		case 1: System.out.println("안녕하세요"); break;
		case 2: System.out.println("good morning"); break;
		case 3: System.out.println("holla"); break;
		case 4: System.out.println("konichiwa"); break;
		}
	}
	
	/*
	 * 3. 반복 출력할 횟수를 매개변수로 받아서 “자바는 맛있다”라는 문장을 반복하여 
	 * 출력하는 loopMethod 메소드를 선언하고, 입력 받아 수를 인자로 
	 * 그 메소드를 호출하는 프로그램을 작성하세요.
	 */
	
	static void loopMethod(int z){
		for(int i = 0; i < z; i++) {
			System.out.println("자바가 맛있다");
		}
	}
	
	/*
	 * 4 실수형 데이터 1개를 매개변수로 받아서 원이 넓이를 계산한 결과값을 반환하는 
	 * circle 메소드을 선언하고, 입력 받은 실수형 데이터를 인자로 넘겨 그 메소드를 
	 * 호출하여 반환되는 결과를 출력하는 프로그램을 작성하세요. 단, 
	 * 음수 데이터는 입력할 수 없습니다.
	 */
	
	 
}





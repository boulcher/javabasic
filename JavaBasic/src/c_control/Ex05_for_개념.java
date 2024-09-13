package c_control;

public class Ex05_for_개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int result = 0;
//		for(int a = 1 ; a <= 500 ; a++) { //a = 0 birinchi, a < 3 ikkinchi, print uchinchi va ohiri a++
//			result = result + a;
//		}
//		System.out.println("result: " + result);
		//result인 10에다가 1+2+3+4+5+6+7+8+9+10를 더하는 것이다.
		

//		for(int a = 10 ; a > 0 ; a = a - 2) {
//			System.out.println(a);
//		}
		int odd = 0, even = 0;
		for(int i = 1; i <= 10; i+=2) {
				odd += i; 			
				even += (i + 1);
			}
		System.out.println("홀수의 합: " + odd);
		System.out.println("짝수의 합: " + even);
		
		
		//		int odd = 0, even = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 == 1) {
//				odd += i;
//			}else {
//				even += i;
//			}
		
//		System.out.println("홀수의 합: " + odd);
//		System.out.println("짝수의 합: " + even);
		
//		for(char ch = 'Z' ; ch >= 'A' ; ch--) {
//			System.out.print(ch);
//		}
		
		//		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
//			System.out.print(ch);
//		}
//		
//		for(char ch = '가' ; ch <= '하' ; ch++) {
//			System.out.print(ch);
//		}
	}

}

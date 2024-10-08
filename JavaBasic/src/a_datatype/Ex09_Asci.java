package a_datatype;

/*
 * c언어의 문자 : Ascii_code
 * 			   한글자를 1B(8bit)로 표현
 * 				256개
 * 
 * java언의 문자 : unicode (with ascii-code)
 * 			   한글자를 2B로 표현
 */

/* 
 * 메모리 단위
 * 
 * 		`1bit : 0(off) / 1(on)
 * 		`8bit = 1Byte
 * 		`1024B = 1KB
 * 		`1024KB = 1MB
 * 		1024MB = 1GB
 * 		`1024GB = 1TB
 */

/*
 * [십진수] 숫자 10개 : 0,1,2,3,4,5,6,7,8,9
 * 
 * 		365 = 3*10(2) + 6*10(1) + 5*10(0)
 * 			= 3*100 + 6*10 + 5*1
 * 			= 300 + 60 + 5
 * 
 * [이진수] 숫자 2개 : 0,1
 * 
 * 		1101 = 1*2(4) + 1*2(3) + 0*2(2)
 */
public class Ex09_Asci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; //4B 정수
		a = 'A'; //4B 변수에 2B 값 지정
		
		System.out.println(a);
		
		char ch = (char)70;
		System.out.println(ch);
	}

}
	/*[Ascii-code] 1B = 8bit
	 * 
	 * ---------------
	 * 
	 * 0100		대문자
	 * 		0001 A
	 * 
	 * 01000010 B
	 * 01000011 C
	 * 
	 * A : 01000001 = 1*2(6) + 1*2(0)
	 * 				= 64 + 1
	 * 				= 65
	 * 
	 * 소문자 a
	 * 0110
	 * 		0001
	 */
	  

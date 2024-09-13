package a_datatype;

/*
 *  shift : 모든 비트의 값을 이동하는 연산자
 *  >>
 *  <<
 *  >>>
 *  
 *  숫자 2를 1Byte 적용한다면?
 *  
 *  2  		00000010    
 *  2<<1	00000100   이것이 shift 연산자다
 *  2>>1	00000001
 *  
 *  2>>>1	00000001
 *  		음수인 경우
 *  		10000010	-->	01000001
 */
public class Ex_Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;		// 00000000	00000000 00000000 00000100
		int b = -4;
		int re1 = b>>2;
		int re2 = b>>>2;
		
		int result2 = a << 2;	// 00000000 00000000 00000000 00010000
		int result = a >> 2;	// 00000000 00000000 00000000 00000001
		System.out.println("a>>2 한 결과:" + result);
		System.out.println("a<<2 한 결과:" + result2);
		System.out.println("b>>>2 한 결과:" + re2);
		
	}

}

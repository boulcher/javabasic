package a_datatype;

/*
 * @@@@@@@@@@@@@@@@@@@@@@@@
 * 
 * String : class (referal)
 * 
 * 		-> 참조형은 무조건 new 연산자료 메모리 확보해야 함
 * 
 * 		=> 단, 하나 String 특권으로 new 생략해도 됨
 */
public class Ex07_StringSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String name2 = "홍길동";
		
		if(name == name2) {
			System.out.println("same address");
		} else {
			System.out.println("different address");
		}
		
		//문자열값을 비교한다면???
		if(name.equals(name2)) {
			System.out.println("same name");
		} else {
			System.out.println("different name");
		}
	}

}

package a_datatype;

public class Ex12_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("홍길동");
		sb.append("바보");
		//sb + "바보";
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("홍길국");
		sb2.append("바보");
		System.out.println(sb2);
		
		//String str = new String("홍길자");
		// [특권] new 생략가능
		//
		String str = "홍길자";
		str += "바보";      //str = str + "바보";
		System.out.println(str);
	}

}

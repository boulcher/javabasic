package d_array;

public class Ex00_문법 {

	public static void main(String[] args) {
		
		// 배열변수 선언
		int [] kor = null;
		//배열객체 생성
		 kor = new int[3];
//		//value 지정
//		kor[0] = 100;
//		kor[1] = 200;
//		kor[2] = 300;
		
		//초기화
		//배열변수 선언 + 객체 생성 + 값지정
		//int []kor = new int
		
		//outputting total
		int total = 0;
		for(int i = 0; i < kor.length; i++) {
			total += kor[i];
		}
		System.out.println("total: " + total);
		
		
	}

}

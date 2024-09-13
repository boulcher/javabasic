package f_static;

/*
 * 		static : 공유
 * 	
 * 		` 메모리 단 하나 설정(지정)
 * 		` 클래스명 첩근
 */

public class Book {

	private static int count; // static qoyilganda va static qoyilmaganda 
						// memory holati farq qiladi
	
	public Book(){
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}

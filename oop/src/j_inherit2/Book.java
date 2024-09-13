package j_inherit2;

/*
 *  @ this / super
 *  
 *  	this  : 자기 객체를 지칭
 *  	super : 부모 객체를 지칭
 *  
 *  @ this() / super()
 *  
 *  	this()  : 다른 생성자를 호출
 *  	super() : 부모 생성자를 호출
 */
public class Book extends Item {

	private String publisher;
	private String writer;
	
	public Book() {
		//super();
		num 		= "0000";
		title 		= "제목없음";
		publisher 	= "미정";
		writer 		= "무명";
		System.out.println("자식 기본생성자");
	}
	
	public Book(String num, String title, String publisher, String writer) {
		//super.num 		= num		;
		//super.title 	= title		;
		super(num,title);
		this.publisher 	= publisher	;
		this.writer 	= writer	;
		System.out.println("자식 인자 생성자");
		
	}
	
	// overriding
	public void output() {
		System.out.println("책번회: " + num);
		System.out.println("책제목: " + title);
		System.out.println("출판사: " + publisher);
		System.out.println("작가: " + writer);
	}
}

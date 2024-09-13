package n_collection;

import java.util.*;

public class Ex03_ArrayList {

	public static void main(String[] args) {
		
		ArrayList <Student> result = method();
		
		for(Student s : result) {
			System.out.println(s);
		}
		System.out.println("[참고] --------------------------");
		// 전체요소를 순서대로 검색할 때 : Enumeration -> Iterator
		Iterator i = result.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	static ArrayList <Student> method() {

		ArrayList <Student> list = new ArrayList <Student>();
		list.add(new Student("홍길자",23));
		list.add(new Student("홍길숙",33));
		list.add(new Student("홍길동",43));
		
		return list;
		
	}

}


package n_collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex03_ArrrayList {

	public static void main(String[] args) {
		
		ArrayList <Student> result = method();
		
		for(Student s : result) {
			System.out.println(s);
		}
		System.out.println("[참고] ----------------------------");
		// 전체요소를 순서대로 검색할 때 : Enumeration -> Iterator
		Iterator i = result.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	static ArrayList <Student> method() {
		
		ArrayList <Student> list = new ArrayList <Student>();
		list.add(new Student("Hongilja", 23));
		list.add(new Student("Hongsuk", 33));
		list.add(new Student("Hongdong", 43));
		
		return list;
	}
}

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "님 학생은 " + age + "살입니다";
	}
}

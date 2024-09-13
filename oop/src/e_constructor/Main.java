package e_constructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println(s1.getName()+"님의 총점: " + s1.calTotal());
		System.out.println(s1.getName()+"님의 평균: " + s1.calAvg());
		
		Scanner input = new Scanner(System.in);
		System.out.println("student's name ->");
		String name = input.next();
		System.out.println("Korean score ->");
		int kor = input.nextInt();
		System.out.println("English score ->");
		int eng = input.nextInt();
		System.out.println("Math score ->");
		int math = input.nextInt();
		
		
		Student s2 = new Student(name, kor, eng, math);		
		System.out.println(s2.getName()+"님의 총점: " + s2.calTotal());
		System.out.println(s2.getName()+"님의 평균: " + s2.calAvg());
	}

}

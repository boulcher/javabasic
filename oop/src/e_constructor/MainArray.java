package e_constructor;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		Student s1 = new Student();

		Scanner input = new Scanner(System.in);
		System.out.println("enter student count ->");
		int count = input.nextInt();
		Student s[] = new Student[count];


		for(int i = 0; i < count; i++) {
			System.out.println("student's name ->");
			String name = input.next();
			System.out.println("Korean score ->");
			int kor = input.nextInt();
			System.out.println("English score ->");
			int eng = input.nextInt();
			System.out.println("Math score ->");
			int math = input.nextInt();


			s[i] = new Student(name, kor, eng, math);		
			System.out.println(s[i].getName()+"님의 총점: " + s[i].calTotal());
			System.out.println(s[i].getName()+"님의 평균: " + s[i].calAvg());
		}
	}
}

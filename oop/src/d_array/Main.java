package d_array;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] s = new Student[3];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < s.length; i++) {
			
			//********************
			s[i] = new Student();
			
			System.out.println("enter student name ->");
			s[i].setName(input.next());
			System.out.println("enter Korean score ->");
			s[i].setKor(Integer.parseInt(input.next()));
			System.out.println("enter English score ->");
			s[i].setEng(Integer.parseInt(input.next()));
			System.out.println("enter math score ->");
			s[i].setMath(Integer.parseInt(input.next()));
			
			Student student = s[i];
			
			System.out.println(student.getName()+ "'s score");
			System.out.println("English : "+student.getEng());
			System.out.println("Math : "+student.getMath());
			System.out.println("Korean : "+student.getKor());
			
			System.out.println(student.getName()+"'s total score is " + student.calTotal());
			System.out.println(student.getName() + "'s total score is " + student.calAvg());
		}
	}

}

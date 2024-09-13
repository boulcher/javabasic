package e_exercise;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("data 개수 크기 ->");
		int su = input.nextInt();
		
		int [] arr = new int[su];
		
		System.out.println("enter integer data");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		GradeExpr grade = new GradeExpr(arr);
		System.out.println("total:" + grade.getTotal());
		System.out.println("average:" + grade.getAverage());
		
		
	}

}

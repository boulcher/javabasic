package a_datatype;

import java.util.Scanner;

public class Ex_2단계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first digit ->");
		int first = input.nextInt();
		System.out.println("Enter second digit ->");
		int second = input.nextInt();
		System.out.println("Enter third digit ->");
		int third = input.nextInt();
		
		
		if(first > second && first > third) {
			System.out.println(first + " is the biggest digit");
		}else if(second > first && second > third){
			System.out.println(second + " is the biggest number");
		}else {
			System.out.println(third + " is the biggest digit!");
		}
	}

}

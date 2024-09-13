package a_datatype;

import java.util.Scanner;

public class Ex_3단계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		//Input 3 integers
		System.out.println("Enter three digits in one row ->");
		int A = input.nextInt();
		int B = input.nextInt();		
		int C = input.nextInt();
		
		//Logic to find  the median
		int median;
		
		if((A >= B && A <= C) || (A <= B && A >= C)) {
			median = A;
		}
		else if((B >= A && B <= C) || (B <=A && B >=C)) {
			median = B;
		}else {
			median = C;
		}
		System.out.println(median + " is the median!");
		
		
	}

}

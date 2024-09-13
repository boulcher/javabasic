package e_method;

import java.util.Scanner;

public class Ex07_excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = input();
		double avg =calculate(score);
		output(avg); //shu avaragedan foydalangani uchun avg qoyildi
		
	}

	//kor, eng, math score enter
	static int [] input() {
		
		int [] score = new int[3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Korean score ->");
		score[0] = input.nextInt();
		System.out.println("English score ->");
		score[1] = input.nextInt();
		System.out.println("Math score ->");
		score[2] = input.nextInt();
		
		return score;
	}
	
	//print total/average scores entered
	static double calculate(int[] score) {
		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i<score.length; i++) {
			total += score[i];
		}
		avg = total / (double)3;
		System.out.println("total: " + total + ", average: " + avg);
		
		return avg;
	}
	
	static void output(double avg) { //mana shotta avg dan foydalanilgani uchun
		switch((int)avg/10) { //(int) qoyilgani bois switch double qabul qimidi
		case 10:
		case 9: System.out.println("A학점"); break;
		case 8: System.out.println("B학점"); break;
		default: System.out.println("F학점"); break;
		}
	}
}

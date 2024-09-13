import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter your age ->");
		int age =  input.nextInt();
		
		if(age >= 20 & age < 30) {
			System.out.print("20대");
		}else if(age >= 30 & age < 40) {
			System.out.print("30대");
		}else {
			System.out.print("other");
		}
		
		System.out.println();
	}

}

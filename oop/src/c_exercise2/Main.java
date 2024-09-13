package c_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Product[] p = new Product[3];
		Scanner input = new Scanner(System.in);
		
		Product myProduct = new Product();
		
		myProduct.setStock(5);
		myProduct.income(3);
		myProduct.sale(3);
		
		
	}

}

package a_datatype;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3의 배수 구하기
		
		/*int a = 3, b = 5, c = 9, d = 11, e = 12, f = 15;
		if(a % 3 == 0) {
			System.out.println("peerfect");
			} else {
				System.out.println("boo");
			}
		*/
		
		//-----------------------------------------------
		
		
		/*int i = (3, 5, 9, 11, 12, 15);
		if(i % 3 == 0) {
			System.out.println("perfect");
		}else {
			System.out.println("boo");
		}
		*/
		
		int[] numbers = {3, 5, 9, 11, 12, 15};
		for (int i : numbers) {
			if(i % 3 == 0) {
			System.out.println("peerfect");
			} else {
				System.out.println("boo");
			}
		}
	}

}

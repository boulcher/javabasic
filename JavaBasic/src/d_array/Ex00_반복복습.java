package d_array;

public class Ex00_반복복습 {

	public static void main(String[] args) {
		
		
		//for문
		for(int i = 0; i < 6; i++) {
			int temp = (int)(Math.random() * 45) + 1; // 0.0 <= random value < 1.0
			System.out.print(temp + "/");
		}
		
		System.out.println();
		
		//while문 변경
		int j = 0;
		while(j < 6) {
			int temp = (int)(Math.random() * 45) + 1;
			System.out.print(temp + "/");
			j++;
		}
		
		System.out.println();
		
		//do~while 변경
		int k = 0;
		do {
			int temp = (int)(Math.random() * 45) + 1;
			System.out.print(temp + "/");
			k++;
		}while( k < 6 );
		System.out.println();
		
		
		
	}

}

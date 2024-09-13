package d_array;

public class Ex03_2차원배열연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[][] {
			{3, -5, 12},
			{-2, 11, 2, -7},
			{21, -21,-35, -93, -11},
			{9, 14, 39, -98}
		};
		
		//출력
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				System.out.print( a[i][j] + "/");
//			}
//			System.out.println();
//		}
		// a 배열의 모든 값의 합을 구하기
//		int sum = 0;
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				sum = sum + a[i][j];
//			}
//		}
//		System.out.println("합:" + sum);
		
		//-----------------------------------------
		// [task] 각 행의 값들의 합이 가장 큰 행을 출력하기
		int hap[] = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				hap[i] = hap[i] + a[i][j];
			}
		}
		
		// 출력
		for(int i = 0; i < hap.length; i++) {
			System.out.println(i + "번째 줄의 합:" + hap[i]);
		}
	
		//합이 가장 큰 행을 출력하기
		int max = hap[0];
		int idx = 0;
		for(int i = 1;  i < hap.length; i++) {
			if(max < hap[i]) {
				max = hap[i];
				idx = i;
			}
		}
		System.out.println("합이 가장 큰 값: " + max);
		System.out.println("합이 가장 큰 행: " + idx);
		
		/* [example] bubble sort
		 * 
		 * [원리] insert sort
		 * select
		 */
		
		//두 변수의 값 맞바꾸기 (swapping)
				/* int a = 5, b = 6;
				 * int temp = a;
				 * a = b;
				 * b = temp;
				 */
				
//				int [] lotto = {45, 2, 15, 27, 10, 42};
//				
//				//bubble 정렬
//				for(int i = lotto.length - 1; i > 0; i--) {
//					for(int j = 0; j < i; j++) { 
//						if(lotto[j] > lotto[j + 1]) {
//							int temp = lotto[j];
//							lotto[j] = lotto[j + 1];
//							lotto[j + 1] = temp;
//						}
//					}
//				}
	}
	
}

package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_while_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		 int i = 1, j = 10;
//
//	      do {
//
//	          if(  i > j ) break;
//
//	          j--;
//
//	      } while( ++i < 5 );
//
//	           System.out.println("i=" +i + " , j = " + j );
		
		
//		-------------------------------------------------------------
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter numbers (1 2 3 4)->");
		String str = input.nextLine(); // "1 2 3 4"
		
		StringTokenizer st = new StringTokenizer(str);
		
		// [문제2] 홀수/짝수의 갯수
		int odd = 0, even = 0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int su = Integer.parseInt(token);
			if(su%2 == 0) even++;
			else odd++;
		}
		System.out.println("짝수 " + even + "개");
		System.out.println("홀수 " + odd + "개");
		
		//		int max = 0;
//		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
//			int su = Integer.parseInt(token);
//			if(max < su) max = su;
//		}
//		System.out.println("큰 수:" + max);
		
		
	}

}

package c_control;

public class Escape_room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		for(int i =1; i <= 10000; i++) {
		//			int su = i;
		//			boolean su8 = false;
		//			
		//			while(su!=0) {
		//				int na = su%10;
		//				
		//				if(na == 8) {
		//					su8 = true;
		//				}
		//				su = su / 10;
		//			}
		//			if(!su8) System.out.println(i);
		//			else System.out.println();
		//		}


		//		int no=0;
		//		for(int i=1;i<=10000;i++) {
		//			int su = i;
		//
		//			while(su!=0) {
		//				int na= su%10;
		//
		//				if(na == 8) {
		//					no++;
		//
		//				}
		//				su = su/10;
		//			} //while 반복문 끝
		//		} //for 반복문 끝
		//		System.out.println(no + "개");


		int count = 0; // Loop through numbers from 1 to 10000        
		for (int i = 1; i <= 10000; i++) {            
			String number = Integer.toString(i);  // Convert the number to a string
			// Loop through each character of the string and count '8's            
			for (int j = 0; j < number.length(); j++) {                
				if (number.charAt(j) == '8') {                    
					count++;                
				}            
			}       

			// Output the result        
			System.out.println("The digit '8' appears " + count + " times.");               



		}
	}
}

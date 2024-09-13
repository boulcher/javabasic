package d_array;

public class Ex03_2차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [][] alpha = new char[3][4];
		
		//값입력
//		for(int i = 0; i < alpha.length; i++) {
//			for(int j = 0; j < 4; j++) {
//				alpha[i][j] = '*';
//			}
//		}
		char ch = 'A';
		for(int i = 0; i < alpha.length; i++) {
			for(int j = 0; j < 4; j++, ch++) {
				alpha[i][j] = ch;
			}
		}
		
		//값출력
		for(int i = 0; i < alpha.length; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(alpha[i][j] + " ");
			}
			System.out.println();
		}
	}

}

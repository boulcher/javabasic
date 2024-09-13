package d_array;

public class Ex99_야구게임 {

	public static void main(String[] args) {

		
		int [] baseball = new int[3];
		
		for(int i = 0; i < baseball.length; i++) {
			baseball[i] = (int)(Math.random()*10);
			for(int j = 0; j < i; j++) {
				if(baseball[j] == baseball[i]) {
					i--;
				}
			}
			System.out.println(baseball[i] + "/");
			
		}
		for(int i = 0; i < baseball.length; i++) {
			System.out.println(baseball[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		//--------------------------------------
		// 2. save one by one to user's entered value answer 
		// 	[ex] 3 4 5
		int []answer = new int[3];
		
		
		
		// 구분작성
		
		
		
		// answer 값 출력
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i] + " ");
		}
		                                     
		
		
		
	}

}

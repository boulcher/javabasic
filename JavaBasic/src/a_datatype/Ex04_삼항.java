package a_datatype;

public class Ex04_삼항 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수가 80보다 크면 '합격' 아니면 '불합격' 처리
		int jumsu = 81;
		String result;
		
		if(jumsu > 80) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println("당신은 " + result);
		
		String result2 = (jumsu > 80)? "합격" : "불합격";
		System.out.println("당신은 " + result2);
	}

}

package a_datatype;

/*
 * 	비교연산자
 * 	> >= < <=  ==  !=
 */
public class Ex05_비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor =90, eng=92, math=88;
		int total = kor + eng + math;
		double avg = (double)total / 3;
		System.out.println("total sum: " + total);
		System.out.println("total average: " + avg);
		
		/*
		 *  [학점구하기]
		 *  
		 *  평균이 90점 이상이면 A학점
		 *  평군이 80이상 90미만이면 B학점
		 *  평균이 70이상 80미만이면 C학점
		 */
		
		
		if(avg >=90 ) {						//만약에 avg값이 90 이상이라면
			System.out.println("A학점");		//그렇다면 'A'학점 출력
		}else if(avg >=80 ) {				//그렇지 않다면
			System.out.println("B학점");
		}else if(avg >=70 ){
			System.out.println("C학점");
		}else {
			System.out.println("D학점");
		}
		
		
		/*
		if(avg >=90 ) {						//this wrong
		}
		if(avg >=80 ) {				//그렇지 
			System.out.println("B학점");
		}
		if(avg >=70 ){
			System.out.println("C학점");
		}
		*/
	}
}

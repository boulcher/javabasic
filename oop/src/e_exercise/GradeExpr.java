package e_exercise;

public class GradeExpr {

	
	int [] jumsu;
		
	GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	
	double getAverage() {
		double avg = (double)getTotal() / jumsu.length;
		return avg;
	}
	
	int getTotal() {
		int total = 0; 
		for(int i = 0; i < jumsu.length; i++) {
			total += jumsu[i];
		}
		return total;
	}
	
	
}

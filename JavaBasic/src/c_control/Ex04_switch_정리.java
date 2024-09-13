package c_control;

public class Ex04_switch_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		switch( a/2) {
		case 1 : System.out.println("일");	break; //agar break qoyilmasa console run qilganda
		case 2 : System.out.println("이");	break; // pasdagi caselar ham chiqib keladi
		case 3 : System.out.println("삼");	break;
		case 4 : System.out.println("사");	break;
		default : System.out.println("나머지"); //default ni hohlagan joyga qoyish mumkin
		}
	}

}

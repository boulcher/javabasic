package e_method;

public class Ex08_overloading {

	public static void method( int i, int j) {
		  i <<= j;
		}
		public static void main ( String  [] args ) {
		  int i = 4, j = 2;
		  method( i, j );
		  System.out.println("i = " + i );
		}

}

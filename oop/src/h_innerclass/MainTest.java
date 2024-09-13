package h_innerclass;
/*
 * inner class : class inside class (member 취급)
 */
class Outer{
	static class Inner{
		static void najabara() {
			System.out.println("잡아봅시다");
		}
	}
}

public class MainTest {

	public static void main(String[] args) {

		Outer.Inner.najabara();
	}
}

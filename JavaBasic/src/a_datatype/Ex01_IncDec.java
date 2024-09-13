package a_datatype;

public class Ex01_IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 7;
		
		a++;
		b--;
		
		/*System.out.println("A=" + a + ", B=" + b);
		System.out.println("A=" + (a+1) + ", B=" + (b+1));
		System.out.println("A=" + a+1 + ", B=" + b+1); //[주의] bunaqa yozish xato. 
		//consolega qarang>>
		a = a + 1;
		b = b + 1;
		System.out.println("A=" + a + ", B=" + b);
		
		a += 1;
		b += 1;
		*/
		System.out.println("A=" + a + ", B=" + b);
		++a;
		--b;
		System.out.println("A=" + a + ", B=" + b);
		
		//---------------------------------------
		int z = 10, y = 10;
		int result = ++z; // z = z + 1; int result = z;
		System.out.println(result);
		
		int result2 = y++;
		System.out.println(result2); 
		/*agar ++y o'rniga y++ bo'ganda y natijasi o'zgarmas edi yaani, result2 natijasi 
		10 chiqar edi 
		*/
		System.out.println("Z=" + z + ", Y=" + y); // Z = 11, Y = 11
		
		System.out.println("Z=" + ++z + ", Y=" + --y); //??
		System.out.println("Z=" + z++ + ", Y=" + y--); //??
		// birinchi Z = 12, Y = 10 holatni memoryga saqlagandan so'ng
		System.out.println("Z=" + z + ", Y=" + y);
		//yana bir marta consolega chiqarsak, endi komputerda hisoblab Z = 13, Y = 9 chiqaradi
	}

}

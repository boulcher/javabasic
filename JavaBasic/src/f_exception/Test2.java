package f_exception;

import java.io.IOException;



class Test2{

	static void method() throws IOException {
		throw new IOException();
	}

	public static void main( String [] args ) {   

		try{

			method();
			System.out.println("TRY");

		} catch( IOException ex ) {
			System.out.println("IOEXCEPTION");

		} catch( Exception ex ) {
			System.out.println("EXCEPTION");

		} finally {
			System.out.println("FINALLY");
		}

		System.out.println("END");

	}

}
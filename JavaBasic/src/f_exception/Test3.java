package f_exception;

import java.io.IOException;



class Test3{

	static void method() throws IOException {
		throw new IOException();
	}

	public static void main( String [] args ) {   

		try{

			method();

			System.out.println("TRY");

		} catch( Exception ex ) {

			System.out.println("EXCEPTION");

		} catch( IOException ex ) {

			System.out.println("IOEXCEPTION");

		} finally {

			System.out.println("FINALLY");

		}

		System.out.println("END");

	}

}
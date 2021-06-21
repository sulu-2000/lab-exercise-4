package Day14ExceptionHandling;

import java.io.FileNotFoundException;

public class FinallyDemo {

	static void funcA() throws FileNotFoundException {
		try {
			System.out.println("Inside funcA()");
			throw new FileNotFoundException();
		}finally {
			System.out.println("Inside finally of funcA()");
		}
	}
	static void funcB() {
		try {
			System.out.println("Inside funcB()");
		}finally {
			System.out.println("Inside finally of funcB()");
		}
	}
	static void funcC() {
		try {
			System.out.println("Inside funcC()");
		}finally {
			System.out.println("Inside finally of funcC()");
		}
	}
	public static void main(String[] args) {
		try {
			funcA();
		}
		catch(Exception e) {
			System.out.println("Exception caught...");
		}
		funcB();
		funcC();
	}

}

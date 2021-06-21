package Day14ExceptionHandling;

public class ThrowDemo {
	static void DemoPro() {
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			System.out.println("caught inside DemoPro...");
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			DemoPro();
		}
		catch(ArithmeticException e) {
			System.out.println("recaught "+e);
		}
	}

}

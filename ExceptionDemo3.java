package Day14ExceptionHandling;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			int i=1/0;
		}
		catch(Exception e) {
		
			System.out.println(e);
		}
		finally {
			System.out.println("finally block called...");
		}
		System.out.println("after exception...");
	}
}

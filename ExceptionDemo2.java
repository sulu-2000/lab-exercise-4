package Day14ExceptionHandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Before Exception...");
		int num=0;
		try {
			num=Integer.parseInt(args[0]);
			int i=1/num;
			System.out.println("immediate line after exception...");
		}
		catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("handled with array index out of bound exception...");
		}
		finally {
			System.out.println("finally called...");
			num=1;
		}
		int i=1/num;
		System.out.println("value of i is ...:"+num);
		System.out.println("After Exception....");
	}

}

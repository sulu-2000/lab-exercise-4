package Day14ExceptionHandling;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		int num=1;
		try {
			num=Integer.parseInt(args[0]);
			int i=1/num;
			System.out.println("immediate line after exception...");
		}
		catch(Exception e) {
			if (e instanceof ArithmeticException) {
				System.out.println("logic to handle arithmetic exception");
				num=num+1;
			}
			else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("logic to handle array index out of bound...");
				num=3;
			}
			else if (e instanceof NumberFormatException) {
				System.out.println("logic to number format exception...");
				num=1;
			}
			int i=num/1;
			System.out.println("value of i is...:"+num);
			System.out.println("After exception...");
		}
	}

}

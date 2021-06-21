package Day14ExceptionHandling;

import java.io.FileNotFoundException;

public class ThrowDemo1 {
	static void throwOne() throws FileNotFoundException 
	{
	System.out.println("Inside throwone.");
	throw new FileNotFoundException();

	}
	public static void main(String[] args) {
		try
		{
			throwOne();
		}
		catch(FileNotFoundException e) {
			System.out.println("Caught  "+e);
		}
	}
}

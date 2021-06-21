package Day14ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class NestedTryDemo {

	public static void main(String[] args) {
		try {
			try {
				try {
					FileInputStream fis=new FileInputStream(args[0]);
				}
				catch(IOException e) {
					System.out.println("Read error...");
				}
			}
			catch(FileSystemNotFoundException e) {
				System.out.println("file does not exist...");
			}catch (Exception e) {
				System.out.println(e);
			}
		}finally {
			System.out.println("rest of code...");
		}

	}

}

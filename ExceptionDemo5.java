package Day14ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		Dog tiger=new Dog();
		Child baby=new Child();
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a item..Stick/biscuit");
		String item=scan.next();
		baby.playWithDog(tiger, item);
	}

}
class DogExceptions extends Exception{
	
}
class DogBiteExceptions extends DogExceptions{
	String msg;
	public DogBiteExceptions(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is..:"+msg;
	}
}
class DogHappyExceptions extends DogExceptions{
	String msg;
	public DogHappyExceptions(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is..:"+msg;
	}
}

class Dog{
	public void play(String item)throws DogBiteExceptions,DogHappyExceptions{
		if(item.equals("stick")) {
			throw new DogHappyExceptions("you beat I bite...");
		}
		else if (item.equals("biscuit")) {
			throw new DogHappyExceptions("I love biscuits...");
		}
	}
	
}
class Child{
	public void playWithDog(Dog tiger, String item) {
		try {
			tiger.play(item);
		}
		catch (DogBiteExceptions dbe) {
			System.out.println(dbe);
		}
		catch (DogHappyExceptions dhe) {
			System.out.println(dhe);
		}
	}
	
}

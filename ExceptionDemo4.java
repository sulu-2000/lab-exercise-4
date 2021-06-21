package Day14ExceptionHandling;
class InvalidCardException extends Exception{
	String msg;
	public InvalidCardException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is ...:"+msg;
		}
}
public class ExceptionDemo4 {

	public static void main(String[] args) {
		ATM atmUser=new ATM();
		try {
			atmUser.insertCard("valid");
		}catch(InvalidCardException ice) {
			System.out.println(ice);
			System.out.println("Action or logic... for invalid card....");
			System.out.println("normal transaction...");
		}
		

	}

}
class ATM{
	public void insertCard(String cardValidity)throws InvalidCardException{
		if(cardValidity.equals("valid")) {
			System.out.println("i will process the card...");
		}
		else {
			throw new InvalidCardException("you have inserted a invalid card...");
		}
	}
}
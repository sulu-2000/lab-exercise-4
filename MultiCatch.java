package Day14ExceptionHandling;

public class MultiCatch {
public static void main(String[] args) 
{
try
{
int i=args.length;
System.out.println("i="+i);
int b=42/i;
int arr[]= {1};
arr[22]=99;
}
catch(ArithmeticException e)
{
	System.out.println("divide by 0:"+e);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Arrayn Index oob:"+e);
}
System.out.println("After try/catch blocks.");
}

}

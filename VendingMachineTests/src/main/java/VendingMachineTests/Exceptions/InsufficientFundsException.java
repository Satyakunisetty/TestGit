package VendingMachineTests.Exceptions;

public class InsufficientFundsException extends Exception {

	private String message;
	public InsufficientFundsException(String msg)
	{
		super(msg);
		this.message = msg;
	}
		
	public void getExceptionMessage()
	{
			System.out.println(this.message);
	}
}

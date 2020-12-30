package VendingMachineTests.Exceptions;

public class InvalidInputException extends Exception {
	
	private String message;
	public InvalidInputException(String msg)
	{
		super(msg);
		this.message = msg;
	}
		
	public void getExceptionMessage()
	{
			System.out.println(this.message);
	}

}

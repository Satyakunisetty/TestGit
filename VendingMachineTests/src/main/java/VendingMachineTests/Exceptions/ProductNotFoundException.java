package VendingMachineTests.Exceptions;

public class ProductNotFoundException extends Exception {

	private String message;
	public ProductNotFoundException(String msg)
	{
		super(msg);
		this.message = msg;
	}
		
	public void getExceptionMessage()
	{
			System.out.println(this.message);
	}
	
	
}

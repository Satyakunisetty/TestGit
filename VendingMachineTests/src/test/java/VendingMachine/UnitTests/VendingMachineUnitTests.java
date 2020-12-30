package VendingMachine.UnitTests;

import org.junit.Assert;
import org.junit.Test;

import VendingMachine.main.VendingMachine;
import VendingMachineTests.implementation.VendingMachineImpl;


public class VendingMachineUnitTests {
		
	@Test
	public void checkCoinValueValid()
	{					
		boolean actualValue = VendingMachine.isCoinValueValid("25");		
		Assert.assertTrue(actualValue);				
	}
	
	@Test
	public void checkCoinValueInValid()
	{					
		boolean actualValue = VendingMachine.isCoinValueValid("11");		
		Assert.assertFalse(actualValue);			
	}
	
	@Test
	public void checkisCoinInvalidValue()
	{					
		boolean actualValue = VendingMachineImpl.isCoinValueValidNumber("techtesters");		
		Assert.assertFalse(actualValue);			
	}

	@Test
	public void checkisCoinValueValidValueNumber()
	{					
		boolean actualValue = VendingMachineImpl.isCoinValueValidNumber("10");		
		Assert.assertTrue(actualValue);			
	}
	
	
}

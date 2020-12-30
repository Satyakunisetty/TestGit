package VendingMachine.main;


import java.util.Scanner;

import VendingMachineTests.Exceptions.InsufficientFundsException;
import VendingMachineTests.Exceptions.InvalidInputException;
import VendingMachineTests.Exceptions.ProductNotFoundException;
import VendingMachineTests.implementation.VendingMachineImpl;

public class VendingMachine 
{
	private static String userSelectedProduct = "";
	private static boolean userinput_product;
	private static int userCoinsValue =0;
	private static String coinValue = ""; 
	
	private static boolean isCoinValueDigit =false;
	private static boolean checkCoinValue = false;
	
	
	private static void userSelect_Product() throws ProductNotFoundException
	{
		//Automatically Initialize VendingMachine Data
		VendingMachineImpl.InitializeData();
		
		//Take Input from user on the product
		System.out.println("Select one product Coke(25), Pepsi(35), Soda(45)");
		Scanner product = new Scanner(System.in);
		userSelectedProduct = product.next();	
		userinput_product = VendingMachineImpl.isValidProduct(userSelectedProduct);
		
		if(userinput_product)		
			System.out.println("Thank you for selecting the product : " + userSelectedProduct);
		else
			throw new ProductNotFoundException("Invalid Product entered and is not available in catalogue");
	}
	
	private static void count_UserInputCoins_Value() throws InvalidInputException
	{
		System.out.println("Enter coins of 1,5,10,25 to pay for selected product. Press q to quit");		 
		String yes = "";
		  
		Scanner userInput_Coins = new Scanner(System.in);
		do
		{
			do
			{
		       coinValue = userInput_Coins.next();	      
		        
		       if(coinValue.toLowerCase().equals("q"))
		    	   break;
		       else
		       {
		    	   System.out.println("Enter next coin value. Press q to quit");
		    	   isCoinValueDigit = VendingMachineImpl.isCoinValueValidNumber(coinValue);		        
		        	if(isCoinValueDigit)
		        	{
		        		if(isCoinValueValid(coinValue))
		        			userCoinsValue += Integer.parseInt(coinValue);
		        		else
		        			System.out.println("Returning Invalid coin value : " + coinValue);
		        	}
		        	else
		        		throw new InvalidInputException("Invalid Input provided");
		        }
		    } while ((isCoinValueDigit == true) && (isCoinValueValid(coinValue)==true));
		      
			
			if(coinValue.toLowerCase().equals("q"))
				break;
		    else
		    {   
		    	System.out.println("Would you like to enter aonther coin. Type Yes to to enter again or Press any key to quit?");
		    	yes = userInput_Coins.next();
		    	System.out.println("Enter next coin value. Press q to quit");
		    	
		    }
		      
		  } while ( yes.toLowerCase().equalsIgnoreCase("yes"));
		  
		  //System.out.println("Entered Coins value is " + userCoinsValue);
	}
	
	public static boolean isCoinValueValid(String coinValue)
	{
		if(Integer.parseInt(coinValue) == 1 ||Integer.parseInt(coinValue) == 5 ||Integer.parseInt(coinValue) == 10||Integer.parseInt(coinValue) == 25)
			return true;	
		
		return false;
	}
	
	public static void main(String [] args) throws InvalidInputException, ProductNotFoundException, InsufficientFundsException 
	{
		
		
		//Capture User Input to select product
		userSelect_Product();
		
		//User enter Coins for a purchase
		count_UserInputCoins_Value();
		  
		//Check user selected product is available with provided coins
		VendingMachineImpl.checkProductPriceWithCoins(userSelectedProduct,userCoinsValue);
			
	}

	
}

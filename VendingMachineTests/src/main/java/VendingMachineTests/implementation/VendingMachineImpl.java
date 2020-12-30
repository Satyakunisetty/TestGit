package VendingMachineTests.implementation;

import java.util.Hashtable;

import VendingMachineTests.Exceptions.InsufficientFundsException;

public class VendingMachineImpl {
	
	public static Hashtable<String,Integer> hash_table = new Hashtable<String,Integer>();
	private static boolean isValidInteger = false;
	private static boolean isValidProduct = false;
	
	public static void InitializeData()
	{
		hash_table.put("coke", 25);
		hash_table.put("pepsi", 35);
		hash_table.put("soda", 45);
	}

	public static boolean isValidProduct(String product) 
	{	
		if(hash_table.containsKey(product.toLowerCase()))
			isValidProduct = true;		
		
		return isValidProduct;		
	}
	
	public static boolean isCoinValueValidNumber(String coinValue)
    {
        for (int i = 0; i < coinValue.length(); i++)
            if (Character.isDigit(coinValue.charAt(i)) == false)
                return false;
 
        return true;
    }
	
	
	public static void checkProductPriceWithCoins(String productName, int CoinValue) throws InsufficientFundsException
	{
		
		int productValue = hash_table.get(productName.toLowerCase());
		
		if(productValue == CoinValue)
		{
			System.out.println("Collect your selected product : " + productName);
			System.out.println("Return coin value : " + (CoinValue-productValue));
		}
		else if(CoinValue < productValue)
		{
			System.out.println("Insufficient Coins provided.");
			System.out.println("Return coin value : " + CoinValue);
			throw new InsufficientFundsException("Insufficient coins provided");
		}
		else if(CoinValue > productValue) 
		{
			System.out.println("Collect your selected product : " + productName + " and look for returned coins value" );
			System.out.println("Return coin value : " + (CoinValue-productValue));
		}
		
	}
}

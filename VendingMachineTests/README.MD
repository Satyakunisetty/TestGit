
Tech Testers Technical test

Question 1 : Write a program to design Vending Machine using your 'favourite language' with all possible tests

Pre-requisites of Softwares to execute the Repository :

1. Java
2. Maven
3. Eclipse

Import the project through Eclipse by navigating to File - Import - Maven - Existing Maven Project - Click Next - Select the project using Browse option
Once sucessfully imported, Refresh the project to ensure the all the Maven dependencies are loaded sucessfully.

Please follow below steps to execute

1. Open VendingMachine.java from VendingMachine.main package under src/main/java - Right click on the file and select the option Run As -> Java Application
	i. Once Executed as Java apllication, It will prompt the user to select the product
		a. Please only select the product from the values provided
		b. If any other value is provided from the prompted list of values an custom exception will be thrown and execution will stop.
	ii. If a valid product is selected by user as per point i, then user will be prompt to provide Valid coins with values 1,5,10.25.
		a. User can enter the valid values as per ii, N times and User can press q to quit 
		b. If by any chance, user enter Invalid coin value and is a Integer coin value, then immediately the coin value is returned 
		   and user is asked whether he wants to conitnue entering coins. Press Yes to continue and enter other coin value and enter any key to quit
	iii. Based on input from point i and ii and if they are valid values at both the levels, then price is checked for the selected product
		a. If the enetered coins values are equal to the price of the product, then only product is given to customer and NO coins are returned
		b. If the enetered coins value is less than the product price, then all entered coins value will be returned and an custom exception is thrown and execution will stop
		c. if the enetered coins value is greater than the product price, then product is given to user and the excess coin vlaues are returned

2. All Custom Exceptions are placed under package name VendingMachineTests.Exceptions

3. All functions related to implementation are placed under VendingMachineTests.implementation package	

4. Unit Tests are written in VendingMachineUnitTests.java file under VendingMachine.UnitTests package.



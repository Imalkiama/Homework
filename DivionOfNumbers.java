import java.util.Scanner;  // Import the Scanner class
class DivionOfNumbers{
	public static void main(String[]args){
	Scanner x = new Scanner (System.in); // Create x Scanner object
		System.out.println("Enter the first number"); 
		int a = x.nextInt();

		System.out.println("Enter the second number"); 
		int b = x.nextInt();
	  
	  
		int Division = a/b;// Read user input
      System.out.println("Division of two given numbers =" +Division); // Read user input
	}
}
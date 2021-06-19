import java.util.Scanner;  // Import the Scanner class
class MuitiplicationNumbers{
	public static void main(String[]args){
	Scanner x = new Scanner (System.in); // Create x Scanner object
		System.out.println("Enter the first number"); 
		int a = x.nextInt();

		System.out.println("Enter the second number"); 
		int b = x.nextInt();
	  
		int multiply = a*b;// Read user input
      System.out.println("multiply of two given numbers =" +multiply); // Read user input
	}
}
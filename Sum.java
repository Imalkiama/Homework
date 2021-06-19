import java.util.Scanner;  // Import the Scanner class
class Sum {
	public static void main(String[] args) {
	Scanner a = new Scanner (System.in); // Create a Scanner object
		System.out.println("Enter the first number"); 
		int x = a.nextInt();

		System.out.println("Enter the second number"); 
		int y = a.nextInt();
	  
		int sum = x + y;	 // Read user input
      System.out.println("Sum of two given numbers = " + sum); // Read user input
	}
}
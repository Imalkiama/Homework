import java.util.Scanner;  // Import the Scanner class
class AverageOfNumbers{
	public static void main(String[]args){
	Scanner x = new Scanner (System.in); // Create x Scanner object
		System.out.println("Enter the first number"); 
		int a = x.nextInt();

		System.out.println("Enter the second number"); 
		int b = x.nextInt();
	  
	  System.out.println("Enter the third number"); 
		int c = x.nextInt();
		
		System.out.println("Enter the fourth number"); 
		int d = x.nextInt();
		
		System.out.println("Enter the fiveth number"); 
		int e = x.nextInt();
		
		int average =(a+b+c+d+e)/5; // Read user input
		
      System.out.println("Average is:=" +average); // Read user input
	}
}
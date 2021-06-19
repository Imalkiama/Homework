import java.util.Scanner; // Import the Scanner class
class ConvertDollar{
	public static void main(String[] args) {
		int rupees;
		Scanner in = new Scanner(System.in);// Create a Scanner object
		System.out.println("Please enter rupees:");
		rupees = in.nextInt();// Read user input
		int dollars = rupees / 200;
		System.out.println(dollars + " Dollars");// Output user input
	}
}
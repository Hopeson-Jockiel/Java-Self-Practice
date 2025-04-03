import java.util.Scanner;

public class AdditionInJava {
	public static void main (String[] args) {
	
	// Create a scanner to obtain input from the command window
	Scanner input = new Scanner (System.in);
	
	int number1; // First number to add
	int number2; // Second number to add
	int sum; // sum of number1 and number2
	
	System.out.print("Enter first integer: "); //prompt
	number1 = input.nextInt();
	
	System.out.print("Enter second integer: "); //prompt
	number2 = input.nextInt();
	
	sum = number1 + number2;
	
	System.out.printf("Sum is %d%n",sum);
	
	}
}
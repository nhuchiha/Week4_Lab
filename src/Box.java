// Exercise #1
import java.util.Scanner;
public class Box 
{
	static int size = 0;
	static char c;
	
	public static void main(String[] args) 
	{		
		Scanner scan = new Scanner(System.in);
		
		// Create new Box object
		Box starBox = new Box();
		starBox.size = 5;
		
		// Inform user for input
		System.out.print("Please enter the character: ");
		c = scan.next().charAt(0);
		
		// Invoke printBox method
		printBox(c);
		
	}
	// Create the printBox method
	public static void printBox()
	{
		for (int i = 0; i < size; i++)
		{
			for (int j = 1; j < size; j++)
			{
				System.out.print("*");
			}
			System.out.print("*");
			System.out.println();
		}
	}
	// Create an overloaded printBox method with parameter
	static char printBox(char c)
	{
		for (int i = 0; i < size; i++)
		{
			for (int j = 1; j < size; j++)
			{
				System.out.print(c);
			}
			System.out.print(c);
			System.out.println();
		}
		
		return c;
	}
}

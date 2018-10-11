/**
 * 
 * @author Akul Patel
 * Practice
 *
 */
import java.util.Scanner;

public class Practice 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//print a statement
		System.out.println("I know how to print to the screen.");
		
		//create an integer, double, and string variable and initialize them
		
		int num; //declared (created) a variable that will store int and is called num
		num = 20; //assigned a value -> first one us called the initialization
		double decimal = 3.1415962; //declared an initialized in one line
		String str = "This is a string with a capital S.";
		
		//Print the contents of the variables
		System.out.println(num + "\n");
		System.out.println(decimal);
		System.out.println(str);

		//multiply int by 2 store in int
		//multiply int by the double and store in the double
		//then concatinate your string with " concatination"
		
		num *= 2; // same as num = num * 2
		decimal = num * decimal;
		str += " concatination"; // str = str + " concatination"
		
		// print num: 40
		
		System.out.println("num: " + num);
		System.out.println("decimal: " + decimal);
		System.out.println("str: " + str);
		
		// your favorite sport is ____ and mine is field hockey
		System.out.print("Please enter your favorite sport: ");
		String favSport = scanner.nextLine();
		System.out.println("\n\nYour favorite sport is " + favSport + " and mine is volleyball.");
		
	}

}

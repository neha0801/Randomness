import java.util.Random;
import java.util.Scanner;

public class Magic8Ball
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		
		String response = "";
		// variable for user input
		String userInput ="y";
		Scanner keyboard = new Scanner(System.in);
		
		while (userInput.equalsIgnoreCase("y"))
		{
			// prompt user for a question
			System.out.println("Whats your Question? ");
			userInput = keyboard.next();
			
			// increased the limit of the random numbers. The random number range is 1 to 20
			int choice = 1 + r.nextInt(20);
			
			if ( choice == 1 )
				response = "It is certain";
			else if ( choice == 2 )
				response = "It is decidedly so";
			else if ( choice == 3 )
				response = "Without a doubt";
			else if ( choice == 4 )
				response = "Yes - definitely";
			else if ( choice == 5 )
				response = "You may rely on it";
			else if ( choice == 6 )
				response = "As I see it, yes";
			else if ( choice == 7 )
				response = "Most likely";
			else if ( choice == 8 )
				response = "Outlook good";
			else if ( choice == 9 )
				response = "Signs point to yes";
			else if ( choice == 10 )
				response = "Yes";
			else if ( choice == 11 )
				response = "Reply hazy, try again";
			else if ( choice == 12 )
				response = "Ask again later";
			else if ( choice == 13 )
				response = "Better not tell you now";
			else if ( choice == 14 )
				response = "Cannot predict now";
			else if ( choice == 15 )
				response = "Concentrate and ask again";
			// added 5 extra options for random answers
			else if ( choice == 16 )
				response = "Don't count on it";
			else if ( choice == 17 )
				response = "My reply is no";
			else if ( choice == 18 )
				response = "My sources say no";
			else if ( choice == 19 )
				response = "Outlook not so good";
			else if ( choice == 20 )
				response = "Very doubtful";
			else 
				response = "8-BALL ERROR!";

			System.out.println( "MAGIC 8-BALL SAYS: " + response );
			
			// prompt whether user wants to continue or not
			System.out.println("Do you wish to continue? (y/n): ");
			userInput = keyboard.next();
			
		}
		keyboard.close();
		System.out.println( "Good Bye :-) " );
	}
}
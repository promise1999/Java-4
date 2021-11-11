import java.util.Scanner;

public class Factorials {
	
    public static void main(String[] args)
	{
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);

		// 
		while (keepGoing.equalsIgnoreCase("Y"))
		{
            try {
                System.out.print("Enter an integer: ");
				int val = scan.nextInt();
				
			//adding a try method to catch error
				System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
				
			//catch error using exceptions
			} catch (IllegalArgumentException ex) {
				System.err.println(ex + "\n");
			}
			// Prompt user to continue
			System.out.println("Another factorial? (y/n) ");
			keepGoing = scan.next();
		}
	}
}


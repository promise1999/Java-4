import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args)
	{
		int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        
		//prompt users to enter word
		System.out.print("Enter a single word (letters only): ");
        String word = scan.nextLine();
        
		//convert to words to uppercase
        word = word.toUpperCase();
        
		//setting up count
		for (int i=0; i < word.length(); i++) {

			//awesome additions by eddie
			try {
				counts[word.charAt(i)-'A']++;			
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.err.println("The word you entered: " + word + " has invalid character  \"" + word.charAt(i) + "\" ");
			}
		}
		//print frequencies
		System.out.println();
		for (int i=0; i < counts.length; i++)
			if (counts [i] != 0)
				System.out.println((char)(i +'A') + " : " + counts[i]);
	}
    

}

    
    
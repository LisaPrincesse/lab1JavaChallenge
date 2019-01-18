package part_C;
/*
 * This program ask the user to enter a string, and reverses a string, and returns it on the screen
 */

import java.util.Scanner;

public class reverseOfString {

	public reverseOfString() {
		// default constructor
	}
	public static void reverse() {
		// Ask the user to enter a string
		
		Scanner inputString= new Scanner(System.in);
		System.out.println("Enter a string:");
		String inpStr=inputString.nextLine();
		inputString.close();
		
		// Split the text by words to be able to reverse them
		String [] text=inpStr.split(" ");
		for( String i: text) {
			
			// reverse the split text
			for(int j=i.length()-1;j>=0;j--)
			{
				char b= i.charAt(j);
				System.out.print(b);
			}
			System.out.print(" ");
					 
			
		}			
	}

	public static void main(String[] args) {

		// function call
		
		reverse();

	}

}

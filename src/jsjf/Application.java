/**
 * @author Elizabeth Dunaway
 *  This is the Application class. This should take a sentance and be able to reverse the sentence. 
 */



package jsjf;

import java.util.*;
import jsjf.ArrayStack;


public class Application {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean play=true;
		
		while(play) {
			System.out.println("Please input sentance:");
			String reversed=scan.nextLine();
			reversed= reverseString(reversed);
			System.out.println("The reversed sentance is:"+reversed);
			/** 
			 * This is where the sentence enters the algorithm. It also outputs the sentace when 
			 * reversed. 
			 */
			
			boolean playagain = true;
			while(playagain) {
				System.out.println("would you like to play again?");
				String a= scan.nextLine();
				if(a.equalsIgnoreCase("y")) {
					play=true;
					playagain= false;
				}
				else if(a.equalsIgnoreCase("n")){
					System.out.println("thanks!");
					play=false;
					playagain =false;
				}
				else {
					System.out.println("error"); 
					playagain= true; 
					
					/**
					 * This is the play again feature. It will ask the player if they want to play again first.
					 * If the player types y then it will have them input another sentence.
					 * If the player types n then it will say thanks then the code will end.  
					 */
			
				}//end else 
				
			}//end while 
			
 		}//end while 
	
		

	}//end public static 

	private static String reverseString(String reversed) {
		if( reversed.contentEquals(""))
			return null;
			
		Stack<Character> stack= new Stack<Character>(); 
		
		for(int i=0; i<reversed.length(); i++);
		stack.push(reversed.chars());
		
		StringBuilder sb= new StringBuilder();
		while(!stack.isEmpty());
		sb.append(stack.pop());
		 
		return sb.toString(); 
			
	}//end String reveredString 
	/**
	 * This is how the sentence is reversed. 
	 * First it will see if they input anything, if they didn't will return nothing. 
	 * If they did input something then it will make a new stack of the sentence. 
	 * Then the sb will return to string if the string is not empty. 
	 */

}//end main 

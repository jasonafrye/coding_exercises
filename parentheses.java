package parentheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*This coding exercise is designed to accept a code-snippet string from the user and 
verify that every left parenthesis is matched with a right parenthesis. 
This is done using a using incremental operators to add for each left parenthesis and subtract for each right. 
The desired outcome will end in 0 and present a affirmative confirmation
*/
	public class parentheses {
		
		public static void main(String[] args) throws IOException  {
			
			//step 1, prompt user for code snippet and listen for input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter code snippet");
			String snippit = br.readLine();
			
			//step 2, initialize integer counter, order flag, and test control variables
			int numPar = 0;
			boolean orderFlag = false;
			char leftP = (char) 40; // ASCII for left parenthesis
			char rightP = (char) 41;

			
			//step 3, step through the string and compare each character, then add, subtract, or ignore accordingly
			for(int i=0; i < snippit.length(); i++){
				char a = snippit.charAt(i);
				if (a == leftP ) numPar++;
				else if (a == rightP) numPar--;

				//also check to see if we have a right Parenthesis  prior to a left parenthesis and thus out of order
				if (numPar < 0) orderFlag = true; }					
			
			
			//Step 4,  initialize results integer 
			int result = 0;
			if (numPar > 0) result = 1;
			else if (numPar < 0) result = 2;
							
			
			// step 5, produce results 
			switch(result) {
			case 0: 
				System.out.println("Hooray! Everything matches!");
				break;
			case 1: 
				System.out.println("Oooo...you have " + numPar + " too many left parentheses");
				break;
			case 2: 
				System.out.println("Oooo...you have " + (numPar * -1) + " too many right parentheses");
				break;
			}
			
			if (orderFlag) System.out.println("Also, note that you have parentheses out of order");
			
			}
			
			
		}
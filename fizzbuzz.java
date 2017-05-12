
public class FizzBuzz {

	public static void main(String[] args) {
		//This is the typical Fizz-Buzz check. The idea is loop through a given set of numbers
		//and print each one...however if the number has a 7 as one of the digits, the program will instead
		//print "FIZZ", if the number is a multiple of 7, the program will instead print "BUZZ"
		//If both conditions apply, the program will print "FIZZ-BUZZ"
		
	
		//initialize boolean flags for FIZZ and BUZZ
		Boolean isFizz = new Boolean(false);
		Boolean isBuzz = new Boolean(false);
		
		
		//loop to check each number in the sequence. 
		for(int i=0; i<=100; i++) {
		//each number in the sequence is passed to a custom class to test for FIZZ or BUZZ and returns a boolean value. 
		isFizz = chkFizz(i);
		isBuzz = chkBuzz(i);
					
		//after checking each number, they are tested in the following IF-THEN-ELSE statement to determine what the system should print
		if(isFizz & isBuzz) System.out.println("FIZZBUZZ!");
		else if(isFizz) System.out.println("FIZZ!");
		else if(isBuzz) System.out.println("BUZZ!");
		else System.out.println(i);
		}
	}

	static Boolean chkBuzz(int x){
		//custom class to receive integer parameter from main method, modulus divide by 7, and flag true if the remainder is 0 
		int y = x%7;
		if(y == 0) return true;
		else return false;	
		}

	static Boolean chkFizz(int x){
		//custom class to receive ingeter parameter from main method, convert the integer to a string, and then loop through each character and check for the number 7, returning true if found
		String strFizz = Integer.toString(x);
		char test = 7;
		
		// i need to set the character to be analyzed 
		for(int i=0; i < strFizz.length(); i++){
			char a = strFizz.charAt(i);	
			if(a== '7') return true;}
		return false;
		}

}


package conditionalStatement;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		String myCharacter;
		
		Scanner sc = new Scanner(System.in);
		myCharacter = sc.nextLine().toLowerCase();
		char charater = myCharacter.charAt(0);
		
		switch(charater){
			
		case 'a' :
			System.out.println("Character is vowel");
			break;
			
		case 'e' :
			System.out.println("Character is vowel");
			break;
		case 'i' :
			System.out.println("Character is vowel");
			break;
		case 'o' :
			System.out.println("Character is vowel");
			break;
		case 'u' :
			System.out.println("Character is vowel");
			break;
		default:
			System.out.println("Character is consonent");
			
		}
		
	}

}

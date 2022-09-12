/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (Wi-Fi diagnosis)
 * Due: 9/12/22
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Andy Chen
*/

import java.util.Scanner;


public class WiFiDiagnosis {
	public static void main(String[] args) {
		final String PROGRAMMER = "Programmer: Andy C."; //me
		final String NO = "NO"; //constant for no
		final String YES = "YES"; //constant for yes
		final String PROMPT_FIX = "Did that fix the problem? (Yes or NO)"; //constant for the prompt after solution suggestion
		final String DONE = "\nDone\n"; //if user input YES/yes
		final String INVALID = "Invalid answer; try again"; // if user don't input NO/no or YES/yes
		String userInput;
		
		//for inputs from keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//start of program
		System.out.println("If you have a problem with internet connectivity " + "this WiFi diagnosis might work.\n");
		System.out.println("Reboot the computer and try to connect");//first solution
		System.out.println(PROMPT_FIX);
		userInput = keyboard.nextLine();
		
		if(userInput.toUpperCase().equals(NO)) { //first input for first solution
			System.out.println("Reboot the router and try to connect");//second solution
			System.out.println(PROMPT_FIX);
			userInput = keyboard.nextLine();
			
			if(userInput.toUpperCase().equals(NO)) { //second input for second solution
				System.out.println("Make sure the cables connecting the router are firmly plugged in " + "and power is getting to the router"); //third solution
				System.out.println(PROMPT_FIX);
				userInput = keyboard.nextLine();
				
				if(userInput.toUpperCase().equals(NO)) { //third input for third solution
					System.out.println("Move the computer closer to the router and try to connect");//fourth solution
					System.out.println(PROMPT_FIX);
					userInput = keyboard.nextLine();
					
					if(userInput.toUpperCase().equals(NO))  //fourth input for fourth solution
						System.out.println("Contact your ISP" + DONE + PROGRAMMER);//end fourth if no
					else if(userInput.toUpperCase().equals(YES))//end fourth if yes
						System.out.println(DONE + PROGRAMMER);//invalid fourth/end
					else
						System.out.println(INVALID);
				}
				else if(userInput.toUpperCase().equals(YES))  //third continue
					System.out.println(DONE + PROGRAMMER);
				else
					System.out.println(INVALID); // invalid third/end
			}
			else if(userInput.toUpperCase().equals(YES))  //second continue
				System.out.println(DONE + PROGRAMMER);
			else 
				System.out.println(INVALID);//invalid second/end
		}
		else if(userInput.toUpperCase().equals(YES))  //first continue
			System.out.println(DONE + PROGRAMMER);	
		else
			System.out.println(INVALID);//invalid first/end
	keyboard.close();	
	}
}

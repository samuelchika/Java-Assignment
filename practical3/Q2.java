/*
 * Write a program that plays the popular scissor-rock- paper game. 
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
 * The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws. Here are sample runs:
 */

/**
 * @author EZEJA
 *
 */
/* we are to output a game with the following condition
 * A Scissors can cut the Paper
 * A Rock can knock a Scissors
 * A Paper can wrap a Rock
 * 
 * 0 = Scissors
 * 1 = Rock
 * 2 = Paper
 * 
 * From our analogy above
 * 0 can cut 2
 * 1 can knock 0
 * 2 can wrap 1
 * 
 * if User is 0 and computer 2
 * 		or 	  1 and computer 0
 * 		or    2 and computer 1
 * 
 * Then the User win
 * 
 * if User and Computer have same data. Then there is a draw
 * 
 * else User lose to computer
 */
import java.util.Scanner;
public class Q2 {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we need 2 integers users and computer
		Scanner consoleInput = new Scanner(System.in);
		int user, computer;
		String userValue = ""; 
		String computerValue = "";
		//Math,random() is used to get a random number between 0 - 1
		computer = (int) ((Math.random() * 10) % 3); //The remainder of anything divided by 3 must be either 0,1 or 2.
		
		System.out.println("This is a Scissors - Rock - Paper Game.");
		System.out.println("A Scissors can cut the Paper \nA Rock can knock a Scissors \nA Paper can wrap a Rock");
		System.out.print("Chose your option scissor (0), rock (1), paper(2): ");
		user = consoleInput.nextInt();
		
		while((user < 0) || (user > 2)) {
			System.out.println("```Invalid Input!!!````\n" + user + " is not accepted!");
			System.out.print("Choose between scissor (0), rock (1), paper(2): ");
			user = consoleInput.nextInt();
		}
		
		
		
			switch(user) { //we are assigning values to user input.
				case 0:
					userValue = "Scissors"; 
					break;
				case 1:
					userValue = "Rock";
					break;
				case 2:
					userValue = "Paper";
					break;
					
			}
			
			switch(computer) { //Assigning the value to the computer random number
				case 0:
					computerValue = "Scissors";
					break;
				case 1:
					computerValue = "Rock";
					break;
				case 2:
					computerValue = "Paper";
					break;	
			}
		
		if((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) { //if the use value is on the winning side.
			System.out.print("The computer is " + computerValue + ". You are " + userValue + ". You won"); 
		} else if (user == computer) { //if the user has same value as the computer
			System.out.print("The computer is " + computerValue + ". You are " + userValue + ". It is a draw");
		} else { //else the user lost to computer.
			System.out.print("The computer is " + computerValue + ". You are " + userValue + ". You lost.");
		}
		
		

	}

}

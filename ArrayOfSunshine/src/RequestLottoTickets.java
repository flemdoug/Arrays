import java.util.Scanner;
import java.util.Random;

public class RequestLottoTickets {
	
	
	
	static int randomNum(){
		Random random = new Random();
		int randomNumber = random.nextInt(10);
		return randomNumber;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numRight = 0;
		
		int[] lottery = {randomNum(), randomNum(), randomNum(), randomNum(), randomNum()};
		
		System.out.println("Please enter 5 numbers for your lottery ticket. Keep in mind, they have to be 0-9.");
		
		System.out.println("What is your first number?");
		int guess1 = scanner.nextInt();
		
		System.out.println("What is your second number?");
		int guess2 = scanner.nextInt();
		
		System.out.println("What is your third number?");
		int guess3 = scanner.nextInt();
		
		System.out.println("What is your fourth number?");
		int guess4 = scanner.nextInt();
		
		System.out.println("What is your fifth and final number?");
		int guess5 = scanner.nextInt();
		
		int[] userGuesses = {guess1, guess2, guess3, guess4, guess5};
		
		if(userGuesses[0] == lottery[0]){
			System.out.println("The first number you guessed is right!");
			numRight++;
		}
		
		if(userGuesses[1] == lottery[1]){
			System.out.println("The second number you guessed is right!");
			numRight++;
		}
		
		if(userGuesses[2] == lottery[2]){
			System.out.println("The third number you guessed is right!");
			numRight++;
		}
		
		if(userGuesses[3] == lottery[3]){
			System.out.println("The fourth number you guessed is right!");
			numRight++;
		}
		
		if(userGuesses[4] == lottery[4]){
			System.out.println("The fifth number you guessed is right!");
			numRight++;
		}
		
		System.out.println("The correct numbers were " + lottery[0] + "," + lottery[1] + "," + lottery[2] + "," + lottery[3] + "," + lottery[4]);
		System.out.println("You guessed, " + guess1 + "," + guess2 + "," + guess3 + "," + guess4 + "," + guess5);
		if(numRight == 1){
		System.out.print("You have gotten one correct number. So, ");
		}
		else if(numRight == 0){
			System.out.print("You have gotten no numbers right. Sorry, but ");
		}
		else{
			System.out.print("You have gotten " + numRight + " correct numbers. So, ");
		}
		
		if(numRight == 0){
			System.out.print("you have won $0");
		}
		
		else if(numRight == 1){
			System.out.print("you have won $5");
		}
		
		else if(numRight == 2){
			System.out.print("You have won $10");
		}
		
		else if(numRight == 3){
			System.out.print("you have won $20");
		}
		
		else if(numRight == 4){
			System.out.print("you have won $50");
		}
		
		else if(numRight == 5){
			System.out.print("you have won $1,000! Congratulations!");
		}
		
		
		scanner.close();
	}
}
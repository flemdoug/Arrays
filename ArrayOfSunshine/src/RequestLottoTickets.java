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
		
		int[] lottery = new int[5];
		
		lottery[0] = randomNum();
		lottery[1] = randomNum();
		lottery[2] = randomNum();
		lottery[3] = randomNum();
		lottery[4] = randomNum();
		
		System.out.println(lottery[0] + "" + lottery[1] + "" + lottery[2] + "" + lottery[3] + "" + lottery[4]);
		
		int[] userGuesses = new int[5];
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
		
		scanner.close();
	}
}
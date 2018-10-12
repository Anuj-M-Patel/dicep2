import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
		//while (die1.roll() != die2.roll());
		
		int roll1 = die1.roll();
		int roll2 = die2.roll();
		System.out.println("" + roll1 + " " + roll2);
		
		while(roll1 != roll2) {
			roll1 = die1.roll();
			roll2 = die2.roll();
			System.out.println("" + roll1 + " " + roll2);
			
		}
		
		
		System.out.println("\n" + die1.getNumOfRolls());

		
		Scanner input = new Scanner(System.in);
		int target;
		
		if (input.hasNextInt()) {
			if (input.nextInt() <= 12 && input.nextInt() >= 2) {
				target = input.nextInt();
			}
		}
		
	}

}

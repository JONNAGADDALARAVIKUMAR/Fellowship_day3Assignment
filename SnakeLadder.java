package day2;

import java.util.Random;

public class SnakeLadder {

	public static void main(String[] args) {
		
			System.out.println("Snake and Ladder game by Single player\n\nThe game is supposed to start");
			
			
			Random random = new Random();
			int diceValue = random.nextInt(6)+1;
			System.out.println("\nDice Value : "+diceValue);
			
			int position = 0;			
			int option = random.nextInt(3);
			
			if(option == 1) // if option = 0 No change in position 
				position+=diceValue;
			
			else if(option == 2)
				position-=diceValue;
			
			if(position < 0)
				position=0;
			System.out.println("\nOption : "+option);
			System.out.println("\nPOSITION : "+position);

	}

}

package day2;

import java.util.Random;

public class SnakeLadder {

	public static void main(String[] args) {
		
			System.out.println("Snake and Ladder game by Single player");
			
			
			Random random = new Random();
			int position = 0;		
			int option;
			int diceValue,count=0;
			

			
			while(position < 100)
			{
				
				diceValue = random.nextInt(6)+1;
				option = random.nextInt(3);
				count++;
			
			
				if(option == 1) // if option = 0 No change in position 
					position+=diceValue;
			
				else if(option == 2)
					position-=diceValue;
				
				if(position < 0)
					position=0;
				
				if(position > 100)
					position-=diceValue;
				
				System.out.println("Position : "+position);
				
			}
			
			System.out.println("No of times Dice rolled : "+count);
			

	}

}

package day2;

import java.util.Random;

public class SnakeLadder {

	public static void main(String[] args) {
		
			System.out.println("\n\tSnake and Ladder game by Two players\n\n");
			
			
			Random random = new Random();
			int firstPlayerPosition = 0, secondPlayerPosition=0;		
			int option;
			int diceValue,firstPlayerChances=0,secondPlayerChances=0;
			
			while(true)
			{
				while(true)//Repeats if the player got Ladder i.e option = 1
				{
				
					diceValue = random.nextInt(6)+1;
					option = random.nextInt(3);
					firstPlayerChances++;
			
					if(option == 0) // if option = 0 No change in position 
						break;
					else if(option == 1)
					{
						firstPlayerPosition+=diceValue;
						
						if(firstPlayerPosition > 100)
							firstPlayerPosition-=diceValue;
					}
					else if(option == 2)
					{
						firstPlayerPosition-=diceValue;
						if(firstPlayerPosition < 0)
							firstPlayerPosition=0;
						break;
					}		
				}
				while(true)//Repeats if the player got Ladder i.e option = 1
				{
				
					diceValue = random.nextInt(6)+1;
					option = random.nextInt(3);
					secondPlayerChances++;
			
					if(option == 0) // if option = 0 No change in position 
						break;
					else if(option == 1) 
					{
						secondPlayerPosition+=diceValue;
						
						if(secondPlayerPosition > 100)
							secondPlayerPosition-=diceValue;
					}
					else if(option == 2)
					{
						secondPlayerPosition-=diceValue;
						if(secondPlayerPosition < 0)
							secondPlayerPosition=0;
						break;
					}
				}
				System.out.println("First Player Position : "+firstPlayerPosition+"\tSecond Player Position : "+secondPlayerPosition);

				if(secondPlayerPosition == 100 || firstPlayerPosition == 100)
					break;
				
			}
			
			if(firstPlayerPosition == 100)
			{
				System.out.println("\n\t******  First Player Won the Game  ******");
			}
			else if(secondPlayerPosition == 100)
				System.out.println("\n\t******  Second Player Won the Game  ******");
			
			System.out.println("\nNo of Chances got by First player : "+firstPlayerChances+"\n\nNo of Chances got by Second player : "+secondPlayerChances);
	}

}

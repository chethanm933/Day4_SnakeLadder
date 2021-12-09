package snakeandladder;

import java.util.HashMap;

public class Game {
	final static int winpoint = 100;
	Dice dice = new Dice();

	public int board(int position, int dicevalue) {

		position = position + dicevalue;
		SnakeAndLadder snl = new SnakeAndLadder();

		if (position > winpoint) {
			position = position - dicevalue;
			return position;
			}
		
		  if(null != snl.snake.get(position)){ 
		  System.out.println("swalloed by a snake"); 
		  position = snl.snake.get(position);  
		  return position;  
		  } 
		  
		  if(position!=snl.ladder.get(position)); { 
		  System.out.println("climbed ladder"); 
		  position = snl.ladder.get(position);
		  return position;  
		  }
	
	}

}

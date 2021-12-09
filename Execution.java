package snakeandladder;

import java.util.Scanner;

public class Execution {
	
	
	Game game = new Game();
	Dice dice = new Dice();
	
	public  void execution() {
	int player1 = 0;
	int player2 = 0;
//	int player1_position = 0;
//	int player2_position = 0;
	int position1 = 0;
	int position2 = 0;
	String next;
	
	
	
	int winpoint = game.winpoint;
	
	
	
	
	do {
		Scanner sc = new Scanner(System.in);
	 	next = sc.next();
	 	int Dice = dice.dicevalue;
	 	int currentplayer = -1;
		
	 	
	 		
		
		if(currentplayer == -1) {
		
		player1 = game.board(player1, Dice);
		System.out.println("player1 dice:"+Dice);
		System.out.println(position1);
		if(position1 == game.winpoint) {
			System.out.println("player1 wins");
			return;
		}
			currentplayer = -2;
		} else {

			if(currentplayer == -2) {
				
				player2 = game.board(player2, Dice);
				System.out.println("player2 dice:"+Dice);
				System.out.println(position2);
				if(position2 == game.winpoint) {
					System.out.println("player2 wins");	
//					return;
			currentplayer = -1;
				} 
		}
	}
		
		} 
			while("m".equals(next));
	}
}
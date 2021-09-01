package snakeAndLadder;

import snakeAndLadder.entities.Player;

public class Driver {
	
	public static void main(String[] args) {
		Game game=new Game(10,1);
		game.addPlayer(new Player("A"));
		game.addPlayer(new Player("B"));
		game.addPlayer(new Player("C"));
		game.addPlayer(new Player("D"));
		game.launch();
	}
}

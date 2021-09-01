package snakeAndLadder.services;

public class DiceService {
	public static int roll(int d) {
		int min=1*d;
		int max=6*d;
		return (int) Math.floor(Math.random()*(max-min+1)+min);
	}
}

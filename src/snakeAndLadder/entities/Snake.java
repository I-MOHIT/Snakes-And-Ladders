package snakeAndLadder.entities;

public class Snake extends BoardEntity{
	public Snake(int start, int end) {
		super(start,end);
	}
	
	@Override
	public String getEncounterMessage() {
		return "Oh! You have encountered a Snake!";
	}
	
	@Override
	public String getString() {
		return "S("+this.getEnd()+")";
	}
}

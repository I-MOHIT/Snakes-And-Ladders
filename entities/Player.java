package snakeAndLadder.entities;

public class Player {
	int position;
	String userName;
	
	public Player(String username) {
		position=0;
		this.userName=username;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}

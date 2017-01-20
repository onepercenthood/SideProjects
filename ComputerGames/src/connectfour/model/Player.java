package connectfour.model;

import java.awt.Color;

/**
 * 
 * @author Hoodie
 *
 */
public class Player {
	
	/** Player Name to be displayed */
	protected String name;
	
	/** Color of player's chips */
	protected Color chipColor;
	
	/** Player's Number: Either 1 or 2 */
	protected int playerNumber;
	
	/**
	 * Constructor for a player. Since connect four is a two-person game there 
	 * 	is always exactly two players: Player1 and Player2
	 * 
	 * @param name is the name of the Player
	 * @param color is the chipColor the player chose
	 * @param playerNumber is the number of the player (either 1 or 2)
	 */
	public Player(String name, Color color, int playerNumber){
		this.name = name;
		this.chipColor = color;
		this.playerNumber = playerNumber;
	}

	/** Getter for Name: returns name of Player */
	public String getName() {
		return name;
	}

	/** Setter for Name: String */
	public void setName(String name) {
		this.name = name;
	}

	/** Setter for Chip Color: returns color */
	public Color getChipColor() {
		return chipColor;
	}

	/** Setter for Chip Color: Color */
	public void setChipColor(Color chipColor) {
		this.chipColor = chipColor;
	}

	/** Getter for Player Number: returns player number (either 1 or 2) */
	public int getPlayerNumber() {
		return playerNumber;
	}

	/** Setter for Player Number: Integer */
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

}

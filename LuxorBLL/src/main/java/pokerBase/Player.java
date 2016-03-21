package pokerBase;

import java.util.UUID;

public class Player {

	private UUID PLayerID;
	private String PlayerName;
	private int PlayerPosition;
	
	
	public Player(String playerName, int playerPosition) {
		this.PLayerID = UUID.randomUUID();
		this.PlayerName = playerName;
		this.PlayerPosition = playerPosition;
	}


	public UUID getPLayerID() {
		return this.PLayerID;
	}


	public void setPLayerID(UUID pLayerID) {
		this.PLayerID = pLayerID;
	}


	public String getPlayerName() {
		return this.PlayerName;
	}


	public void setPlayerName(String playerName) {
		this.PlayerName = playerName;
	}


	public int getPlayerPosition() {
		return this.PlayerPosition;
	}


	public void setPlayerPosition(int playerPosition) {
		this.PlayerPosition = playerPosition;
	}
	
	
}

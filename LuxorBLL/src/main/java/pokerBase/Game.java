package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {

	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	
	public Game(UUID tableID, ArrayList<Player> gamePlayers) {
		this.GameID = UUID.randomUUID();
		this.TableID = tableID;
		this.GamePlayers = gamePlayers;
	}

	public UUID getGameID() {
		return this.GameID;
	}

	public void setGameID(UUID gameID) {
		this.GameID = gameID;
	}

	public UUID getTableID() {
		return this.TableID;
	}

	public void setTableID(UUID tableID) {
		this.TableID = tableID;
	}

	public ArrayList<Player> getGamePlayers() {
		return this.GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		this.GamePlayers = gamePlayers;
	}
	
	public void addPlayerToGame(Table table, Player player) {
		this.GamePlayers.add(player);
	}
	
	public void removePlayerFromGame(Table table, Player player) {
		this.GamePlayers.remove(player);
	}
	
}

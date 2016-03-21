package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	
	public Table(ArrayList<Player> tablePlayers) {
		this.TableID = UUID.randomUUID();
		this.TablePlayers = tablePlayers;
	}

	public UUID getTableID() {
		return this.TableID;
	}

	public void setTableID(UUID tableID) {
		this.TableID = tableID;
	}

	public ArrayList<Player> getTablePlayers() {
		return this.TablePlayers;
	}

	public void setTablePlayers(ArrayList<Player> tablePlayers) {
		this.TablePlayers = tablePlayers;
	}
	
	public void addPlayerToTable(Player player) {
		this.TablePlayers.add(player);
	}
	
	public void removePlayerFromTable(Player player) {
		this.TablePlayers.remove(player);
	}
}

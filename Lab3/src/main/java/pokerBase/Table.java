package pokerBase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Table {
	private UUID TableID;
	private List<Player> TablePlayers = new ArrayList<Player>();
	
	public Table(ArrayList<Player> tablePlayers){
		TablePlayers=tablePlayers;
		TableID = UUID.randomUUID();
	}

	public List<Player> getTablePlayers() {
		return TablePlayers;
	}

	public void setTablePlayers(List<Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}

	public UUID getTableID() {
		return TableID;
	}
	
	public void AddPlayerToTable( Player player){
		this.TablePlayers.add(player);
	}
}
package pokerBase;

import java.util.UUID;

public class Player {
	private UUID  PlayerID;
	private String PlayerName;
	private int PlayerPosition;
	
	public Player(String playerName, int playerPosition){
		PlayerName = playerName;
		PlayerPosition = playerPosition;
		PlayerID = UUID.randomUUID();
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getPlayerPosition() {
		return PlayerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		PlayerPosition = playerPosition;
	}

	public UUID getPlayerID() {
		return PlayerID;
	}
}

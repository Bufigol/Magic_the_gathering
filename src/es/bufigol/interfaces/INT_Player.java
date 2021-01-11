package es.bufigol.interfaces;

public interface INT_Player {
	
	public void playsMatch(INT_Player rival);
	
	public boolean updatePlayerDataFromServer();
	
	public boolean updatePlayerDataToServer();
	
	public boolean createDeckForPlayer();
}

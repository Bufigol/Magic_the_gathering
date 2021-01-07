package es.bufigol.interfaces;

public interface INT_Player {
	
	public void playsMatch(INT_Player rival);
	
	public boolean updateDataFromServer();
	
	public boolean updateDataToServer();
	
	public boolean createDeck();
}

package es.bufigol.interfaces;

public interface INT_Player {
	
	public void playsMatch();
	
	public boolean updateDataFromServer();
	
	public boolean updateDataToServer();
	
	public boolean createDeck();
}

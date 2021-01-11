package es.bufigol.interfaces;

import java.util.Set;

public interface INT_Deck {
	
	public INT_Card getCardFromDeck();
	
	public Set<INT_Card> getAllCardsFromDeck();
	
	public boolean addCardToDeck(INT_Card card);
	
	public boolean addMultipleCardsToDeck(Set<INT_Card> cards);

}

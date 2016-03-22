package exceptions;

import pokerBase.Deck;
import pokerBase.Hand;


public class exHands extends Exception {

	private Hand h;

	public exHands(Hand h) {
		super();
		this.h = h;
	}

	public Hand getH() {
		return h;
	}
	
	
	
}

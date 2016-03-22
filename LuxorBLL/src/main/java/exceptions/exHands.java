package exceptions;

import java.util.ArrayList;

import pokerBase.Deck;
import pokerBase.Hand;


public class exHands extends Exception {

	private ArrayList<Hand> hands;

	public exHands(ArrayList<Hand> hands) {
		super();
		this.hands = hands;
	}

	public ArrayList<Hand> getH() {
		return hands;
	}
	
	
	
}

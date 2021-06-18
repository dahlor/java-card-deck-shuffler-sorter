package com.atlantiscoding;

public class Card {
	
	private int rank;
    private int suit;
    
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public String toString() {
        String[] ranks = {null, null, "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", 
        				  "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
        String[] suits = {"HEARTS", "DIAMONDS", "SPADES", "CLUBS"};
        String cardString = ranks[this.rank] + " of " + suits[this.suit];
        return cardString;
    }
		
}
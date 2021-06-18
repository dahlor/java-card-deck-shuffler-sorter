package com.atlantiscoding;

// 1. Create a "Card" object with fields for "Suit" and "Rank"

public class Card {
	
	private Integer rank;
	private Integer suit;
	
	public Card(Integer rank, Integer suit) {
		this.rank = rank;
		this.suit = suit;
    }
    
    public String toString() {
        String[] ranks = {null, null, "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
        String[] suits = {"HEARTS", "DIAMONDS", "SPADES", "CLUBS"};
        String cardString = ranks[this.rank] + " of " + suits[this.suit];
        return cardString;
    }

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}
		
}
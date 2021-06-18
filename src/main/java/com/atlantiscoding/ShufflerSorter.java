package com.atlantiscoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflerSorter {
	
	public static void main(String[] args) {

// 2. Populate a List<Card> with all 52 cards
		
		List<Card> deckOfCards = new ArrayList<Card>();
		
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 2; rank <= 14; rank++) {
				deckOfCards.add(new Card(rank, suit));
			}
		}

// 3. Print the size of the deck to the console
		
		System.out.println(deckOfCards.size() + " cards in the deck.");

// 4. Shuffle the deck
		
        Collections.shuffle(deckOfCards);
		
// 5. Print the deck of cards to the console
		
		System.out.println("\nShuffled Deck:");
		
		for (Card eachIndividualCard : deckOfCards) {
			System.out.println(eachIndividualCard);
		}

// 6. Sort the deck of cards by rank (ignoring suit) and print to the console		
		
		System.out.println("\nSorted by Rank:");
		
		deckOfCards.sort(new RankSorter());
		
		for (Card eachIndividualCard : deckOfCards) {
			System.out.println(eachIndividualCard);
		}


// 7. Sort the deck of cards by suit first and then rank; print to the console		
		
		System.out.println("\nSorted by Suit and Rank:");
		
		
	}	
}

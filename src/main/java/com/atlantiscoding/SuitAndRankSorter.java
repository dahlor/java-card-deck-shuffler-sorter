package com.atlantiscoding;

import java.util.Comparator;
 
public class SuitAndRankSorter implements Comparator<Card> 
{
    public int compare(Card c1, Card c2) {
    	return c1.getSuit() - c2.getSuit();
	}
}
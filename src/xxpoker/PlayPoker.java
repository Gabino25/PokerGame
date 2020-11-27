package xxpoker;

import java.util.ArrayList;
import java.util.List;

public class PlayPoker {

	static final String sep ="*************************************";
	
	public static void main(String[] args) {
		System.out.println("Comienza PlayPoker");
		Deck deck = Deck.getInstance(); 
		System.out.println(sep);
		System.out.println(deck);
		System.out.println(sep);
		
		/*
		Hand hand1 = deck.getHand(); 
		Hand hand2 = deck.getHand();
		*/
		
		Hand hand1 = getFull(); 
		Hand hand2 = deck.getHand();
		
		System.out.println(hand1);
		System.out.println(sep);
		System.out.println(hand2);
		System.out.println(sep);
		System.out.println(deck);
		String strWhoWins = deck.whoWins(hand1,hand2);
		System.out.println(sep);
		System.out.println("strWhoWins:"+strWhoWins);
		System.out.println(sep);
		System.out.println("Finaliza PlayPoker");
		hand1.getEscaleraReal(); 
		
	}

	private static Hand getEscaleraReal() {
		List<Card> cards = new ArrayList<Card>(); 
		cards.add(new Card(Utils.CLUBS,Utils.ACE)); 
		cards.add(new Card(Utils.CLUBS,Utils.JACK)); 
		cards.add(new Card(Utils.CLUBS,Utils.QUEEN)); 
		cards.add(new Card(Utils.CLUBS,Utils.KING)); 
		cards.add(new Card(Utils.CLUBS,"10")); 
		Hand hand = new Hand();
		hand.setCards(cards);
		return hand;
	}
	
	private static Hand getPoker() {
		List<Card> cards = new ArrayList<Card>(); 
		cards.add(new Card("Clubs","2")); 
		cards.add(new Card("Diamonds","2")); 
		cards.add(new Card("Hearts","2")); 
		cards.add(new Card("Spades","2")); 
		cards.add(new Card("Clubs","5")); 
		Hand hand = new Hand();
		hand.setCards(cards);
		return hand;
	}
	
	private static Hand getFull() {
		List<Card> cards = new ArrayList<Card>(); 
		cards.add(new Card("Clubs","2")); 
		cards.add(new Card("Diamonds","2")); 
		cards.add(new Card("Hearts","2")); 
		cards.add(new Card("Clubs","5")); 
		cards.add(new Card("Diamonds","5")); 
		Hand hand = new Hand();
		hand.setCards(cards);
		return hand;
	}
	
}




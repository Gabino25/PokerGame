package xxpoker;

import java.util.List;

public class PlayPoker {
	

	private static final String sep ="*************************************";
	
	public static void main(String[] args) {
		System.out.println("Comienza PlayPoker");
		Deck deck = Deck.getInstance(); 
		System.out.println(sep);
		System.out.println(deck);
		System.out.println(sep);
		Hand hand1 = deck.getHand(); 
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
	}
	
}




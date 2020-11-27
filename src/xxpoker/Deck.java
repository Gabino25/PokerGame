package xxpoker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck{

	private final String[] figures = {"Clubs","Diamonds","Hearts","Spades"};
	private final String[] values = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	private static Deck obj; 
	private Deck() {
		cards = new ArrayList<Card>(); 
		for(int i=0;i<figures.length;i++) {
			for(int j=0;j<values.length;j++) {
				Card card = new Card(figures[i],values[j]); 
				cards.add(card); 
			}
		}
	}
	private List<Card> cards;

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	} 
	
	public static Deck getInstance() {
		if(null!=obj) {
			return obj; 
		}else {
			return new Deck();
		}
	}
	
	@Override
	public String toString() {
		String str =""; 
		for(Card i:cards) {
			str = str+""+i.toString()+"\n"; 
		}
		return str; 
	}

	public Hand getHand() {
		// TODO Auto-generated method stub
		Hand retval = new Hand(); 
		List<Card> listCards = new ArrayList<Card>(); 
		Random rand = new Random();
		int low = 1;
		for(int i=0;i<5;i++) {
			int high = cards.size();
			int idx = rand.nextInt(high-low)+low;
		    Card card = cards.get(idx); 
			cards.remove(idx);
			listCards.add(card); 
		}
		retval.setCards(listCards);
		return retval;
	}
	
}

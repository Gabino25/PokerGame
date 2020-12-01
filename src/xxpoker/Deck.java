package xxpoker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck{

	private final String[] figures = Utils.figures;
	private final String[] values = {Utils.ACE,"2","3","4","5","6","7","8","9","10",Utils.JACK,Utils.QUEEN,Utils.KING};
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

	public String whoWins(Hand hand1, Hand hand2) {
		String str = "Sin Ganador";
		boolean b1 = false; 
		boolean b2 = false; 
		b1 = hand1.getEscaleraReal(); 
		b2 = hand2.getEscaleraReal(); 
		System.out.println("h1escaleraReal:"+b1);
	    System.out.println("h2escaleraReal:"+b2);
		str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
		
		
		b1 = hand1.getEscaleraColor(); 
		b2 = hand2.getEscaleraColor(); 
		System.out.println("h1escaleracolor:"+b1);
	    System.out.println("h2escaleracolor:"+b2);
	    str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
		
		
		b1 = hand1.getPoker(); 
		b2 = hand2.getPoker(); 
		System.out.println("h1poker:"+b1);
	    System.out.println("h2poker:"+b2);
	    str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
		
		b1 = hand1.getFull();
		b2 = hand2.getFull(); 
		System.out.println("h1full:"+b1);
	    System.out.println("h2full:"+b2);
	    str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
		
		b1 = hand1.getStraight();
		b2 = hand2.getStraight(); 
		System.out.println("h1Straight:"+b1);
	    System.out.println("h2Straight:"+b2);
	    str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
		
		b1 = hand1.getFlush();
		b2 = hand2.getFlush(); 
		System.out.println("h1Flush:"+b1);
	    System.out.println("h2Flush:"+b2);
	    str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
		
		b1 = hand1.getTreeOfaKind();
		b2 = hand2.getTreeOfaKind(); 
		System.out.println("h1TreeOfaKind:"+b1);
	    System.out.println("h2TreeOfaKind:"+b2);
	    str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
		
		b1 = hand1.getTwoPair();
		b2 = hand2.getTwoPair(); 
		System.out.println("h1TwoPair:"+b1);
	    System.out.println("h2TwoPair:"+b2);
	    str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
	
		b1 = hand1.getOnePair();
		b2 = hand2.getOnePair(); 
		System.out.println("h1OnePair:"+b1);
	    System.out.println("h2OnePair:"+b2);
	    str = compareResults(b1,b2); 
		if(!"Sin Ganador".equals(str)) {
			return str;
		}
		
		int h1maxvalue = hand1.getMaxValue(); 
	    int h2maxvalue = hand2.getMaxValue(); 
		System.out.println("h1maxvalue"+h1maxvalue);
	    System.out.println("h2maxvalue"+h2maxvalue);
	    str = h1maxvalue>h2maxvalue?"Player 1":h1maxvalue==h2maxvalue?"Sin Ganador":"Player 2";
	    return str;
	}
	
	public String compareResults(boolean b1,boolean b2) {
		String retval = "Sin Ganador";
		if(b1) {
			if(b2) {
				retval = "Sin Ganador";
			}else {
				retval = "Player 1";
			}
		}else {
			if(b2) {
				retval = "Player 2";
			}else {
				retval = "Sin Ganador";
			}
		}
		return retval; 
	}
	
}

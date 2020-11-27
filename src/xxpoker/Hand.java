package xxpoker;

import java.util.Collections;
import java.util.List;

public class Hand {
	private final String[] figures = {"Clubs","Diamonds","Hearts","Spades"};
	private List<Card> cards;
	private boolean escaleraReal; 
	private boolean escaleraColor; 
	private int maxValue; 

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> pCards) {
		this.cards = pCards;
		System.out.println(PlayPoker.sep);
		System.out.println(cards);
		System.out.println(PlayPoker.sep);
		System.out.println(PlayPoker.sep);
		Collections.sort(cards);
		System.out.println(PlayPoker.sep);
		System.out.println(cards);
	} 
	
	@Override
	public String toString() {
		String str =""; 
		for(Card i:cards) {
			str = str+""+i.toString()+"\n"; 
		}
		return str; 
	}
	
	public String getHighValue() {
	  String str = null ;
	  return str; 
	}

	public int getMaxValue() {
		for(Card i:cards) {
			if(i.getValueInt()>maxValue) {
				maxValue = i.getValueInt();
			}
		}
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public boolean getEscaleraReal() {
		int idx = 0; 
		Card[] tmp = new Card[cards.size()];
		Card[] tmp2= {};
		for(Card i:cards) {
			tmp[idx++]= i; 
		}
		
		for(int i=0;i<figures.length;i++) {
			boolean getval = Contains("10"+figures[i],tmp,tmp2);
			if(getval) {
					getval = Contains("Jack"+figures[i],tmp,tmp2);
					if(getval) {
						getval = Contains("Queen"+figures[i],tmp,tmp2);
						if(getval) {
							getval = Contains("King"+figures[i],tmp,tmp2);
							if(getval) {
								getval = Contains("Ace"+figures[i],tmp,tmp2);
								if(getval) {
								escaleraReal = getval; 
								break;
								}
							}
						}
					}
			}
		}
		
		return escaleraReal;
	}
	
	public boolean Contains(String pValue,Card[] tmp1,Card[] tmp2){
		boolean retval = false; 
		for(int i=0;i<tmp1.length;i++) {
			if(pValue.equals(tmp1[i].getValue())) {
				retval =  true;
				break;
			}
		}
		if(retval) {
			tmp2 = new Card[tmp1.length-1];
			int idx2 = 0;
			for(int i=0;i<tmp1.length;i++) {
				if(!pValue.equals(tmp1[i].getValue())) {
					tmp2[idx2++] = tmp1[i]; 
				}
			}
		}
		return retval; 
	}
	

	public void setEscaleraReal(boolean escaleraReal) {
		this.escaleraReal = escaleraReal;
	}

	public boolean getEscaleraColor() {
		int idx = 0; 
		Card[] tmp = new Card[cards.size()];
		Card[] tmp2= {};
		for(Card i:cards) {
			tmp[idx++]= i; 
		}
		
		for(int i=0;i<figures.length;i++) {
			boolean getval = Contains("Ace"+figures[i],tmp,tmp2);
			if(getval) {
				return false;
			}
		}
		
		for(int i=1;i<tmp.length;i++) {
			boolean getval = isConsecutive(tmp[i-1],tmp[i]); 
			if(!getval) {
				escaleraColor = false;
				return escaleraColor; 
			}
		}
		
		escaleraColor = true; 
		
		
		return escaleraColor;
	}

	private boolean isConsecutive(Card card1, Card card2) {
		if(1==card2.compareTo(card1)) {
			return true;
		}else {
			return false;	
		}
		
	}

	public void setEscaleraColor(boolean escaleraColor) {
		this.escaleraColor = escaleraColor;
	}


		
}

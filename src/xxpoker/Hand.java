package xxpoker;

import java.util.List;

public class Hand {
  
	private List<Card> cards;
	private int maxValue; 

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
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
		
}

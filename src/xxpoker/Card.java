package xxpoker;

public class Card {
	 private String figure;
	 private String value;
	 private int valueInt; 
	 
	 public Card(String pFigure,String pValue) {
		this.figure =  pFigure; 
		this.value = pValue; 
	 }
	 
	 public String getFigure() {
		return figure;
	 }

	 public void setFigure(String figure) {
		this.figure = figure;
	 }

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}	
	
	@Override
	public String toString() {
		return value+figure;
	}

	public int getValueInt() {
		switch(value){
		case "Ace":return 14;
		case "2":return Integer.parseInt(value);
		case "3":return Integer.parseInt(value);
		case "4":return Integer.parseInt(value);
		case "5":return Integer.parseInt(value);
		case "6":return Integer.parseInt(value);
		case "7":return Integer.parseInt(value);
		case "8":return Integer.parseInt(value);
		case "9":return Integer.parseInt(value);
		case "10":return Integer.parseInt(value);
		case "Jack":return 11;
		case "Queen":return 12;
		case "King":return 13;
		default:return 0;
		}
	}

	public void setValueInt(int valueInt) {
		this.valueInt = valueInt;
	}
	
}
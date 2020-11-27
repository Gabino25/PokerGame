package xxpoker;

public class Card {
	 private String figure;
	 private String value;
	 
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
	
}
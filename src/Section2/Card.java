package Section2;

public abstract class Card {
	String holderName;
	String cardNumber;
	String expiryDate;
	public String getCardNumber() {
		return cardNumber;
	}
	public String getholderName() {
		return holderName;
	}
	public String getexpiryDate() {
		return expiryDate;
	}
	public void setCardNumber(String CardNumber) {
		this.cardNumber=CardNumber;
	}
	public void setholderName(String holderName) {
		this.holderName=holderName;
	}
	public void setexpiryDate(String expiryDate) {
		this.expiryDate=expiryDate;
	}
	public Card(String cardNumber,String holderName,String expiryDate) {
	this.cardNumber=cardNumber;
	this.holderName=holderName;
	this.expiryDate=expiryDate;
	}
}

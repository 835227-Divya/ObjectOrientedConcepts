package Section2;

public class PaybackCard extends Card {
	private int pointsEarned;
	private double totalAmount;
	public int getpointsEarned() {
		return pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setpointsEarned(int pointsEarned) {
		this.pointsEarned=pointsEarned;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount=totalAmount;	
	}
	public PaybackCard(String holderName,String cardNumber,String expiryDate,int pointsEarned,double totalAmount) {
		super(cardNumber,holderName,expiryDate);
		this.pointsEarned=pointsEarned;
		this.totalAmount=totalAmount;
	}
	void show() {
	System.out.println(holderName+" 's Payback card Details:");
	System.out.println("Card Number" +cardNumber);
	System.out.println("Points Earned"+pointsEarned);
	System.out.println("Total Amount"+totalAmount);
	
	}
}


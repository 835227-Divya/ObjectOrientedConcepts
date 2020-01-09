package Section2;

public class MembershipCard extends Card{
	private int rating;
	public int getRating() {
		return rating;
	}
		public void setRating(int rating) {
			this.rating=rating;
		}
		public MembershipCard(String cardNumber,String holderName,String expiryDate,int rating){
			super(cardNumber,holderName,expiryDate);
			this.rating=rating;
			System.out.println("Rating"+rating);
		
	}
		void display() {
			System.out.println(holderName+" 's Payback card Details:");
			System.out.println("Card Number" +cardNumber);
			System.out.println("Rating"+rating);
		}
}

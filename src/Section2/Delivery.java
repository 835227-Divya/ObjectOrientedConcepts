package Section2;

public class Delivery {
	void displayDeliveryDetails(String bowler,String batsman) {
		System.out.println("Player details of the Delivery");
		System.out.println("Bowler:"+bowler);
		System.out.println("Batsman:"+batsman);
	}
	void displayDeliveryDetails(Long runs) {
		if(runs==4) {
			System.out.println("Number of runs scored in the delivery: 4");
			System.out.println("It is a Boundary");
		}
		else if(runs==6) {
			System.out.println("Number of runs scores in the Delivery: 6");
			System.out.println("It is a sixer");
		}
		else {
			System.out.println("Number of runs scored in the delivery: "+runs);
			
		}
	}
	

}

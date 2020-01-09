package Section3;

public class CricketPlayer extends Player implements IPlayerStatistics {
	private int totalRunsScored;
	private int noOfwicketsTaken;
	public CricketPlayer(String name,String teamName,int noOfmatches,int totalRunsScored,int noOfwicketsTaken) {
		super(name,teamName,noOfmatches);
		this.totalRunsScored=totalRunsScored;
		this.noOfwicketsTaken=noOfwicketsTaken;
	}
	public void displayPlayerStatistics() {
		System.out.println("Player Details");
		System.out.println("player name: "+name);
		System.out.println("Team name:" +teamName);
		System.out.println("No of matches:"+noOfMatches);
		System.out.println("Total Runs Scored:"+totalRunsScored);
		System.out.println("No of wickets taken:"+noOfwicketsTaken);
	}
	

}

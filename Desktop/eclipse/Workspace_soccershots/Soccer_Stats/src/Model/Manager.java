package Model;

import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leageTeams;
	Player goalieteamone = new Player(1, 5);
	Player goalieteamtwo = new Player(2, 5);

	

	public Manager(){
		Team team1 = new Team("bluejays");
		Team team2 = new Team("sox");
		leageTeams.add(team1);
		Match match1 = new Match(team1, team2, 1);
		Match match2 = new Match(team1, team2, 2);
	}
	
	public void DisplayTopScoringMatches(){
		match1.team1.getWinner();
		System.out.println("fd");
	}
	public void DisplayTop5Players(){
		//TODO: IMPLEMENT THIS
	}
	public void DisplayTopGoalie(){
		//TODO: IMPLEMENT THIS
	}
	
	public static void main(String args[]){
		Manager m = new Manager();
		m.DisplayTop5Players();
		m.DisplayTopScoringMatches();
		m.DisplayTopGoalie();
	}
}

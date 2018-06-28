package football_app;

import java.util.ArrayList;

public class FootballTeam1 {
	String name;
	String mascot;
	String country;
	ArrayList <FootballPlayer>  team = new ArrayList<FootballPlayer>();

	public FootballTeam1(String name, String mascot, String country, ArrayList <FootballPlayer>  team) {
		this.name = name;
		this.mascot = mascot;
		this.country = country;
		this.team = team;
	}
	public FootballTeam1(String country2, String name2) {
		// TODO Auto-generated constructor stub
	}
	public void display(double size) {
		for(FootballPlayer player : team) {
			if(player.getSize()==size) {
				player.returnValues();
			}
	
			
			}
		}
		
		
	

	public void display (String name) {
		for(FootballPlayer player : team) {
			if(player.getName()==name) {
				player.returnValues();
	
}
			
		}
	}
			}
package football_app;

import java.util.ArrayList;

public class App {

	private static final String mascot = null;
	private static final String  country= null;
	private static final String name = null;

	public static void main (String [] args) {
		FootballPlayer fs1 = new FootballPlayer(1.9, 11, "Thomas Müller", "Braun", "Verteidiger");
		//fs1.returnValues();

		ArrayList FootballPlayers = new ArrayList();
		ArrayList FootballPLayers = new ArrayList(8);
		ArrayList<FootballPlayer> FootballPlayers1 = new ArrayList<FootballPlayer>();
		FootballPlayer fs2 = new FootballPlayer(1.7, 15, "Arjen Robben","Rot","Stuermer");
		FootballPlayer fs3 = new FootballPlayer(2.1, 13, "Kingsley Coman","Braun", "FLuegelspieler");
		FootballPlayer fs4 = new FootballPlayer(1.5, 19,"Robert Lewandowski","Grün", "Torwart");
		FootballPlayer fs5 = new FootballPlayer(1.85, 21,"Manuel Neuer","Braun","Torwart");
		FootballPlayer fs6 = new FootballPlayer(1.75, 22,"Lukas Podolski","Braun","Linker Fluegel");
		FootballPlayer fs7 = new FootballPlayer(1.95, 23,"Leroy Sané","Braun","Aussenverteidiger");
		FootballPlayer fs8 = new FootballPlayer(2.05, 24,"Jerome Boateng","Braun","Innenverteidiger");
		
	FootballPlayers1.add(fs1);
	FootballPlayers1.add(fs2);
	FootballPlayers1.add(fs3);
	FootballPlayers1.add(fs4);
	FootballPlayers1.add(fs5);
	FootballPlayers1.add(fs6);
	FootballPlayers1.add(fs7);
	FootballPlayers1.add(fs8);
	


	FootballTeam1  BayernMunich = new FootballTeam1("FCBAYERN", "DEUTSCHLAND","JAGUAR",FootballPlayers1);
	BayernMunich.display(1.7);
    BayernMunich.display("Arjen Robben");


 
 
	}
}

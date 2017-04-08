package model;

//import java.util.ArrayList;
//import java.util.List;
//import model.Data;

public class Game {
	private String ID;
	private Officer referee;
	private int numOfAthletes;
	private String type;
	// private List<Athlete> list;
	private Athlete[] athlete;
	//private Data data;
	//private int predictNum;

	// Constructor
	public Game(String ID, Officer referee, int numOfAtheletes, String type, Athlete[] athlete) {
		// this.setID(ID);
		// this.setReferee(referee);
		// this.setNumOfAlthlete(numOfAthelete);
		// this.setType(type);
		// this.list = new ArrayList<>();

	}

	public Game(String ID, Officer referee, int numOfAtheletes, String type, Athlete[] athlete, int predictNum) {
		this(ID, referee, numOfAtheletes, type, athlete);
	}

	// Getters and Setters
	public String getType() {
		return type;
	}

	// public void setType(String type) {
	// this.type = type;
	// }

	// public int getNumOfAlthlete() {
	// return numOfAthlete;
	// }
	//
	// public void setNumOfAlthlete(int numOfAthlete) {
	// this.numOfAthlete = numOfAthlete;
	// }

	public Officer getReferee() {
		return referee;
	}

	// public void setReferee(Officer referee) {
	// this.referee = referee;
	// }

	public String getID() {
		return ID;
	}

	// public void setID(String iD) {
	// ID = iD;
	// }

	// public Athlete[] getAthletes() {
	// new Athlete[numOfAthletes];
	// return athlete;
	// }

	public void showGame() {
		System.out.println("*******************\nGame ID:" + this.ID);
		System.out.print("Referee: " + referee.getName());
		// this.referee.showPerson();
		System.out.println("  Number of athletes:" + this.numOfAthletes + " Game type:\n");
		System.out.println("Athletes in this game:");
		System.out.println("AthleteID    Name    Age    State    TotalPoint    CurrentPoint    CompeteTime");
		for (int i = 0; i < numOfAthletes; i++) {
			System.out.println(athlete[i]);

		}
	}

}

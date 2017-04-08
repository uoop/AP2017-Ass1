package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//import menu.SelectType;

/**
 * Data.java This class creates and stores the Participants' and Game data
 * 
 * @author Siqi Yang
 * 
 */
public class Data {
	private Swimmer[] swimmer;
	private Cyclist[] cyclist;
	private Sprinter[] sprinter;
	private Officer[] officer;
	private SuperAthlete[] superAthlete;

//	private SelectType selectType;
//	private Game[] game;

	private Athlete[] pickedSwimmer;
	private Athlete[] pickedCyclist;
	private Athlete[] pickedSprinter;

	private int min = 5;// minimum number of Athletes for starting a game
	private int max = 8;// maximum number of Athletes for starting a game
	private int numOfAthletes = 0;// number of Athletes in a created game
	private int numOfSwimmers = 10;
	private int numOfCyclists = 10;
	private int numOfSprinters = 10;
	private int numOfOfficers = 10;
	private int numOfSuperAthletes = 10;

	private int numOfPickedSwimmers;// number of Swimmers who joined a game
	private int numOfPickedCyclists;
	private int numOfPickedSprinters;
	private int numOfPickedSuperAthletes;
	
	private boolean haveSetNumOfAthlete = true;

	public Data() {
		
		//TODO using arraylist;

		swimmer = new Swimmer[numOfSwimmers];
		for (int i = 0; i < numOfSwimmers; ++i) {
			List<Swimmer> swimmers= new ArrayList<>();
			Swimmer swimmer = new Swimmer(i, "swim", i * 5, "VIC", 0, 0, 0);
		}

		cyclist = new Cyclist[numOfCyclists];
		for (int i = 0; i < numOfCyclists; ++i) {
			cyclist[i] = new Cyclist(i, "cycle", i * 5, "VIC", 0, 0, 0);
		}

		sprinter = new Sprinter[numOfSprinters];
		for (int i = 0; i < numOfSprinters; ++i) {
			sprinter[i] = new Sprinter(i, "run", i * 5, "VIC", 0, 0, 0);
		}

		officer = new Officer[numOfOfficers];
		for (int i = 0; i < numOfOfficers; ++i) {
			officer[i] = new Officer(i, "officer", i * 5, "VIC");
		}

		superAthlete = new SuperAthlete[numOfSuperAthletes];
		for (int i = 0; i < numOfSuperAthletes; ++i) {
			swimmer[i] = new Swimmer(i, "super", i * 5, "VIC", 0, 0, 0);
		}

	}

	public void setNumOfAthletes() {
		Random random = new Random();
		
		do {
			System.out.println("\n[Generating number of athletes]");
			int rdmNumOfAthletes = random.nextInt(max);
			if (rdmNumOfAthletes < min) {
				System.out.println("\n[Not enough Athletes. Game cancelled]");
			} else {
				numOfAthletes = rdmNumOfAthletes;
				System.out.println("\n[There are " + numOfAthletes + " athletes in the current game]");
				haveSetNumOfAthlete = false;
				// TODO the logic is not right;
				// for (int i = 0; i < numOfAthletes; i++) {
				// game[i] = new Game("G" + (i + 1),
				// officer[random.nextInt(numOfOfficers)], numOfAthletes,
				// selectType.getGameType(), getSwimmer());
				// }

			}
		} while (haveSetNumOfAthlete);

	}

	public int getNumOfAthletes() {
		return numOfAthletes;
	}

	/**
	 * 
	 * Create random number of Swimmers and Athletes and put them into
	 * numOfPickedSwimmers array
	 * 
	 */
	public Athlete[] getSwimmer() {

		pickedSwimmer = new Athlete[numOfAthletes];
		Random random = new Random();

		int rdmNumOfSwimmers = random.nextInt(numOfAthletes);
		numOfPickedSwimmers = rdmNumOfSwimmers;

		for (int i = 0; i < numOfPickedSwimmers; i++) {
			do {
				pickedSwimmer[i] = swimmer[random.nextInt(numOfSwimmers)];
			} while (pickedSwimmer[i] != pickedSwimmer[i - 1]);
		}

		int rdmNumOfSuperAthletes = numOfAthletes - numOfPickedSwimmers;
		numOfPickedSuperAthletes = rdmNumOfSuperAthletes;

		for (int i = 0; i < numOfPickedSuperAthletes; i++) {
			while (!(pickedSwimmer[i] instanceof Swimmer) && (pickedSwimmer[i] != pickedSwimmer[i - 1])) {
				pickedSwimmer[i] = superAthlete[random.nextInt(numOfSuperAthletes)];
			}
		}
		
		for (int i = 0; i < numOfAthletes; i++) {
			System.out.println(" "+(i+1)+"."+pickedSwimmer[i]);

		}
		return pickedSwimmer;
	}
	
	@Override
	public String toString(){
		return Arrays.toString(pickedSwimmer);
	}

//	public void setSwimmer(Swimmer[] swimmer) {
//		this.swimmer = swimmer;
//	}
	
	
	public Athlete[] getCyclist() {

		pickedCyclist = new Athlete[numOfAthletes];
		Random random = new Random();

		int rdmNumOfCyclists = random.nextInt(numOfAthletes);
		numOfPickedCyclists = rdmNumOfCyclists;

		for (int i = 0; i < numOfPickedCyclists; i++) {
			do {
				pickedCyclist[i] = cyclist[random.nextInt(numOfCyclists)];
			} while (pickedCyclist[i] != pickedCyclist[i - 1]);
		}

		int rdmNumOfSuperAthletes = numOfAthletes - numOfPickedCyclists;
		numOfPickedSuperAthletes = rdmNumOfSuperAthletes;

		for (int i = 0; i < numOfPickedSuperAthletes; i++) {
			while (!(pickedCyclist[i] instanceof Cyclist) && (pickedCyclist[i] != pickedCyclist[i - 1])) {
				pickedCyclist[i] = superAthlete[random.nextInt(numOfSuperAthletes)];
			}
		}
		
		for (int i = 0; i < numOfAthletes; i++) {
			System.out.println(" "+(i+1)+"."+pickedCyclist[i]);

		}
		return pickedCyclist;
	}
	
	public String PickedCyclistsToString(){
		return Arrays.toString(pickedCyclist);
	}



//	public void setCyclist(Cyclist[] cyclist) {
//		this.cyclist = cyclist;
//	}

	public  Athlete[] setSprinter() {

		pickedSprinter = new Athlete[numOfAthletes];
		Random random = new Random();

		int rdmNumOfSprinters = random.nextInt(numOfAthletes);
		numOfPickedSprinters = rdmNumOfSprinters;

		for (int i = 0; i < numOfPickedSprinters; i++) {
			do {
				pickedSprinter[i] = sprinter[random.nextInt(numOfCyclists)];
			} while (pickedSprinter[i] != pickedSprinter[i - 1]);
		}

		int rdmNumOfSuperAthletes = numOfAthletes - numOfPickedSprinters;
		numOfPickedSuperAthletes = rdmNumOfSuperAthletes;

		for (int i = 0; i < numOfPickedSuperAthletes; i++) {
			while (!(pickedSprinter[i] instanceof Sprinter) && (pickedSprinter[i] != pickedSprinter[i - 1])) {
				pickedSprinter[i] = superAthlete[random.nextInt(numOfSuperAthletes)];
			}
		}
		
		for (int i = 0; i < numOfAthletes; i++) {
			System.out.println(" "+(i+1)+"."+pickedSprinter[i]);

		}
		return pickedSprinter;
	}
	public String PickedSprintersToString(){
		return Arrays.toString(pickedSprinter);
	}

	public Athlete[] getSprinter() {
		return pickedSprinter ;
	}

}

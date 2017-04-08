package menu;

import java.util.Scanner;
import model.Data;

public class PredictWinner {
	private Scanner scanner;
	private int predictNum = 0;
	private Data data;
	private boolean haveSelectedWinner = true;
	private int input;
	private SelectType selectType;
	//private int numOfAthlete;
	
	public PredictWinner(){
		selectType = new SelectType();
		data = new Data();
	}

	public void predictWinner() {

		
		

		do {
			data.setNumOfAthletes();

			if (selectType.getGameType() == "Swimming") {
				
				System.out.println(data.getSwimmer());
			} else if (selectType.getGameType() == "Cycling") {
				data.PickedCyclistsToString();
			} else if (selectType.getGameType() == "Running") {
				data.PickedSprintersToString();
			}
			System.out.println("\nPlease predict a winner:");
			scanner = new Scanner(System.in);
			try {

				input = scanner.nextInt();
				if (1 <= input && input <= data.getNumOfAthletes()) {
					predictNum = input;
					haveSelectedWinner = false;
					System.out.println("\n[You have predicted " + predictNum + " as winner.]");
				} else {
					System.out.println("\n[Please input the menu number. Try again.]");
				}

			} catch (Exception ex) {
				System.out.println("\n[It is not a number. Try again.]");
			}
		} while (haveSelectedWinner);
	}
	
	public int getPredictWinner(){
		return predictNum;
	}
	
	public boolean gethaveSelectedWinner(){
		return haveSelectedWinner;
	}

}

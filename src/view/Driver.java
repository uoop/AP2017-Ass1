package view;

import java.util.Scanner;

import menu.PredictWinner;
import menu.SelectType;
//import model.Data;
//import model.Game;

public class Driver {
	private PredictWinner predictWinner;
	private SelectType selectType;
	private int decision;

	public Driver() {
		predictWinner = new PredictWinner();
		selectType = new SelectType();
		

	}

	public void startUp() {

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\nOzlympic Game" 
					+ "\n===================================" 
					+ "\n1. Select a game to run"
					+ "\n2. Predict the winner of the game" 
					+ "\n3. Start the game"
					+ "\n4. Display the final results of all games" 
					+ "\n5. Display the point of all athletes" 
					+ "\n6. Exit");

			System.out.print("\nEnter an option: _ ");

			try {
				decision = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("\n[Enter menu numbers only. Try again.]");
				continue;
			}

			switch (decision) {

			case 1:
				selectType.selectType();

				break;

			case 2:
				if(selectType.gethaveChosenGame()==false){
					predictWinner.predictWinner();
					break;
				}else{
					System.out.print("\n[Please choose a game type first.]");
					break;
				}
				
				
			case 3:
				if(selectType.gethaveChosenGame()==false && predictWinner.gethaveSelectedWinner()==false){
					predictWinner.predictWinner();
					break;
				}else{
					System.out.print("\n[Please choose a game type and predict winner first.]");
					break;
				}

				
			case 4:

				break;
			case 5:

				break;
			case 6:
				System.out.println("\n[Goodbye.]");
				break;

			default:
				System.out.println("\n[Only Numbers 1 to 6 are allowed]");
				break;

			}
		} while (decision != 6);
		scanner.close();

	}
}

package model;

import java.util.Random;

public class SuperAthlete extends Athlete {
	private String gameType;
	public SuperAthlete(int ID, String name, int age, String state,String gameType,int totalPoint, int currentPoint, int competeTime) {
		super(ID, name, age, state, totalPoint, currentPoint, competeTime);
		this.gameType = gameType;
	}

	public void compete() {
		if(this.gameType == "Swimming"){
			Random random = new Random();
			super.setCompeteTime(random.nextInt(100) + 100);
			
		}else if(this.gameType == "Cycling"){
			Random random = new Random();
			super.setCompeteTime(random.nextInt(300) + 500);
			
		}else if(this.gameType == "Running"){
			Random random = new Random();
			super.setCompeteTime(random.nextInt(10) + 10);
			
		}
		
	}

}

package model;

import java.util.Random;

public class Swimmer extends Athlete {
	public Swimmer(int ID, String name, int age, String state, int totalPoint, int currentPoint, int competeTime) {
		super(ID, name, age, state, totalPoint, currentPoint, competeTime);
	}

	public void compete() {
		Random random = new Random();
		super.setCompeteTime(random.nextInt(100) + 100);
	}

}

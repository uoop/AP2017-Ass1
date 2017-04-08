package model;

public abstract class Athlete extends Participants{
	
	private int totalPoint;
	private int currentPoinnts;
	private int competeTime;
	
	public Athlete(int ID, String name, int age, String state,int totalPoint, int currentPoint, int competeTime)
	{
		super(ID, name, age, state);
		this.totalPoint=0;
		this.setCurrentPoinnts(0);
		this.competeTime=0;
	}
	//create random time
	abstract public void compete();
	

	public int getTotalPoints() {
		return totalPoint;
	}
	//used to update the total points
	public void setTotalPoints() {
		this.totalPoint += this.currentPoinnts;
	}

	public int getCurrentPoinnts() {
		return currentPoinnts;
	}

	public void setCurrentPoinnts(int currentPoinnts) {
		this.currentPoinnts = currentPoinnts;
	}
	public int getCompeteTime() {
		return competeTime;
	}
	public void setCompeteTime(int competeTime) {
		this.competeTime = competeTime;
	}
	

}

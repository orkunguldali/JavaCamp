package homework4_3JavaCamp;

import java.util.Date;

public class Campaign {
	
	private String name;
	private int duration;
	private int startingDay;
	private int expirationDay;
	
	public Campaign(String name, int startingDay, int expirationDay) {
		super();
		this.name = name;
		this.startingDay = startingDay;
		this.expirationDay = expirationDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartingDay() {
		return startingDay;
	}

	public void setStartingDay(int startingDay) {
		this.startingDay = startingDay;
	}

	public int getExpirationDay() {
		return expirationDay;
	}

	public void setExpirationDay(int expirationDay) {
		this.expirationDay = expirationDay;
	}

	public int getDuration(int startingDay, int expirationDay) {
		return expirationDay- startingDay;
	}
	
	
	
}

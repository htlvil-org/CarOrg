package pkgData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author schueler
 */
public class Take implements Comparable<Take> {
	String fisher = null, fish = null;
	int weight=0;
	LocalDate dateOfTake = LocalDate.now();
	
	public String getFisher() {
		return fisher;
	}
	public void setFisher(String fisher) {
		this.fisher = fisher;
	}
	public String getFish() {
		return fish;
	}
	public void setFish(String fish) {
		this.fish = fish;
	}
	public int getWeight() {
		return weight;
	}
	
	public LocalDate getDateOfTake() {
		return dateOfTake;
	}
	public void setDateOfTake(LocalDate dateOfTake) {
		this.dateOfTake = dateOfTake;
	}
	public Take(String fisher, String fish, LocalDate tdate, int weight) {
		super();
		this.fisher = fisher;
		this.fish = fish;
		this.weight = weight;
		this.dateOfTake = tdate;
	}
	public String toString() {
		return fisher + "," + fish + "," + weight + ";" + dateOfTake.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
	}
	@Override
	public int compareTo(Take _take) {
		int retValue = fisher.compareTo(_take.fisher);
		if (retValue == 0) {
			retValue = fish.compareTo(_take.fish);
			if (retValue == 0) {
				try {
					retValue = this.dateOfTake.compareTo(_take.dateOfTake);
				} catch (Exception e) {
				}
			}
		}
		
		return retValue;
	}
	@Override
	public boolean equals(Object take) {
		return this.compareTo((Take) take)==0?true:false;
	}
}

package pkgData;

import java.util.TreeSet;

public class Database {
	private TreeSet<Take> collAllTakes = new TreeSet<>();  //  @jve:decl-index=0:

	public void addTake(Take t) throws Exception {
		if (collAllTakes.contains(t)) {
			throw new Exception("take " + t + " already stored");
		} else {
			collAllTakes.add(t);
		}
		
	}
	
	public TreeSet<Take> getTakes() {
		return collAllTakes;
	}
	
	public void removeTake(Take t) throws Exception {
		if (!collAllTakes.contains(t)) {
			throw new Exception("take " + t + " not stored");
		} else {
			collAllTakes.remove(t);
		}

	}
}

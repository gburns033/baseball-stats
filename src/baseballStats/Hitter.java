package baseballStats;

import java.util.HashMap;

public class Hitter {
	
	HashMap<String, Integer> hitterStats = new HashMap<String, Integer>();

	public Hitter() {
		hitterStats.put("Plate Appearances", 0);
		hitterStats.put("At Bats", 0);
		hitterStats.put("Runs", 0);
		hitterStats.put("Hits", 0);
		hitterStats.put("Singles", 0);
		hitterStats.put("Doubles", 0);
		hitterStats.put("Triples", 0);
		hitterStats.put("Home Runs", 0);
		hitterStats.put("Walks", 0);
		hitterStats.put("Stolen Bases", 0);
		hitterStats.put("Caught Stealing", 0);
	}

	public Hitter(int plateAppearances, int atBats, int runs, int hits, int singles, int doubles, int triples, int homeRuns, int walks, int sb, int cs) {
		hitterStats.put("Plate Appearances", plateAppearances);
		hitterStats.put("At Bats", atBats);
		hitterStats.put("Runs", runs);
		hitterStats.put("Hits", hits);
		hitterStats.put("Singles", singles);
		hitterStats.put("Doubles", doubles);
		hitterStats.put("Triples", triples);
		hitterStats.put("Home Runs", homeRuns);
		hitterStats.put("Walks", walks);
		hitterStats.put("Stolen Bases", sb);
		hitterStats.put("Caught Stealing", cs);
	}

	public void setPlateAppearances(int plateAppearances) {
		hitterStats.put("Plate Appearances", plateAppearances);
	}

	public void setAtBats(int atBats) {
		hitterStats.put("At Bats", atBats);
	}
	
	public void setRuns(int runs) {
		hitterStats.put("Runs", runs);
	}

	public void setHits(int hits) {
		hitterStats.put("Hits", hits);
	}

	public void setSingles(int singles) {
		hitterStats.put("Singles", singles);
	}

	public void setDoubles(int doubles) {
		hitterStats.put("Doubles", doubles);
	}

	public void setTriples(int triples) {
		hitterStats.put("Triples", triples);
	}

	public void setHomeRuns(int homeRuns) {
		hitterStats.put("Home Runs", homeRuns);
	}

	public void setWalks(int walks) {
		hitterStats.put("Walks", walks);
	}
	
	public void setStolenBases(int sb) {
		hitterStats.put("Stolen Bases", sb);
	}
	
	public void setCaughtStealing(int cs) {
		hitterStats.put("Caught Stealing", cs);
	}
	
	public int getPlateAppearances() {
		return hitterStats.get("Plate Appearances");
	}

	public int getAtBats() {
		return hitterStats.get("At Bats");
	}
	
	public int getRuns() {
		return hitterStats.get("Runs");
	}

	public int getHits() {
		return hitterStats.get("Hits");
	}

	public int getSingles() {
		return hitterStats.get("Singles");
	}

	public int getDoubles() {
		return hitterStats.get("Doubles");
	}

	public int getTriples() {
		return hitterStats.get("Triples");
	}

	public int getHomeRuns() {
		return hitterStats.get("Home Runs");
	}

	public int getWalks() {
		return hitterStats.get("Walks");
	}
	
	public int getStolenBases() {
		return hitterStats.get("Stolen Bases");
	}
	
	public int getCaughtStealing() {
		return hitterStats.get("Caught Stealing");
	}

	public float calculateBattingAverage() {
		int hits = hitterStats.get("Hits");
		int atBats = hitterStats.get("At Bats");
		
		return (float)hits / atBats;
	}
	
	public float calculateOnBasePercent() {
		int hits = hitterStats.get("Hits");
		int walks = hitterStats.get("Walks");
		int plateAppearances = hitterStats.get("Plate Appearances");
		
		return (float)(hits + walks) / plateAppearances;
	}
	
	public float calculateSluggingPercent() {
		int singles = hitterStats.get("Singles");
		int doubles = hitterStats.get("Doubles");
		int triples = hitterStats.get("Triples");
		int homeRuns = hitterStats.get("Home Runs");
		int atBats = hitterStats.get("At Bats");
		
		return (float)(singles + (doubles * 2) + (triples * 3) + (homeRuns * 4)) / atBats;
	}
	
	public float calculateOPS() {
		return calculateSluggingPercent() + calculateOnBasePercent();
	}
	
	public float calculateStolenBasePercent() {
		int sb = hitterStats.get("Stolen Bases");
		int cs = hitterStats.get("Caught Stealing");
		return (float)sb / (sb + cs);
	}
}
